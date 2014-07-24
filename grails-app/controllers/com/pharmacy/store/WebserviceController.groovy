package com.pharmacy.store

import java.lang.reflect.Type

import com.google.gson.reflect.TypeToken

import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC

class WebserviceController {

	def syncService
	def mongoService
	
	static allowedMethods = [syncBilling: ["POST", "GET"], syncInventory: ["POST", "GET"]]

	//GsonBuilder
	def gsonBuilder
	
    def index() { }
	
		
	def syncBilling() {
		//cast parameters into arraylist
		println "received params: "+params+ " bill List: "+params.billList;
		
		Type billingCommandListType = new TypeToken<List<BillingCommand>>() {}.getType();
		def gson = gsonBuilder.create()
		ArrayList<BillingCommand> billList = gson.fromJson(params.billList, billingCommandListType)
		
		println "list count: "+billList.size()
		
		
		//call sync service
		String lastUpdatedTimeStamp = syncService.syncBilling(billList)
		
		
		//return lastUpdatesTS
		render (text: lastUpdatedTimeStamp)
	}
	
	def getLastUpdatedTimeStampForBilling() {
		
		//get getLastUpdatedTimeStampForBilling from mongoservice
		def timeStamp= mongoService.getLastUpdatedTimeStampForBilling()
		render (text: timeStamp)
		
	}
	
	def syncInventory() {
		//cast parameters into arraylist
		println "received params: "+params+" request: "+request.toString();
		
		Type inventoryCommandListType = new TypeToken<List<InventoryCommand>>() {}.getType();
		def gson = gsonBuilder.create()
		ArrayList<InventoryCommand> inventoryList = gson.fromJson(params.inventoryList, inventoryCommandListType)
		
//		ArrayList inventoryList = new ArrayList<InventoryCommand>(params)
		
		//call sync service
		String lastUpdatedTimeStamp = syncService.syncInventory(inventoryList)
		
		//return lastUpdatesTS
		render (text: lastUpdatedTimeStamp)
	}
	
	def getLastUpdatedTimeStampForInventory() {
		
		//get getLastUpdatedTimeStampForInventory from mongoservice
		def timeStamp= mongoService.getLastUpdatedTimeStampForInventory()
		render (text: timeStamp)
		
	}
	
	def testBillSync() {
		println "Bill count: "+Billing.count()
		def billCommand = new BillingCommand(" "+Billing.count()+1, 1.value.toLong(), " "+2, 1.value.toLong(), 'gre123', new Date(), 3, 0, 123, false, new Date().getTime())
		
		ArrayList<BillingCommand> billList1 = new ArrayList<BillingCommand>()
		billList1.add(billCommand)
		
		billCommand = new BillingCommand(" "+Billing.count()+1, 1.value.toLong(), " "+2, 1.value.toLong(), 'gre123', new Date(), 3, 0, 123, false, new Date().getTime())
		billList1.add(billCommand)
		
		def gson = gsonBuilder.create()
		def json = gson.toJson(billList1).toString()
		
		println "JSON: "+json
		
		redirect(action:'syncBilling', params:[billList:json])
		
	}
	
	def testInventorySync() {
		println "Item count: "+Inventory.count()
		def itemCommand = new InventoryCommand(" "+Inventory.count()+1, 1.value.toLong(), " "+2, 'item123', new Date(), 123, 12, 34, 2, 5, false, new Date().getTime())
		//(" "+Inventory.count()+1, 1.value.toLong(), " "+2, 1.value.toLong(), 'gre123', new Date(), 3, 0, 123, false, new Date().getTime())
		
		ArrayList<InventoryCommand> itemList1 = new ArrayList<InventoryCommand>()
		itemList1.add(itemCommand)
		
		itemCommand = new InventoryCommand(" "+Inventory.count()+1, 1.value.toLong(), " "+2, 'item123', new Date(), 133, 62, 24, 6, 3, false, new Date().getTime())
		itemList1.add(itemCommand)
		
		def gson = gsonBuilder.create()
		def json = gson.toJson(itemList1).toString()
		
		println "JSON: "+json
		
		redirect(action:'syncInventory', params:[inventoryList:json])
		
	}
}
