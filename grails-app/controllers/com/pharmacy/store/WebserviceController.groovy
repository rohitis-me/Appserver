package com.pharmacy.store

import static groovyx.net.http.ContentType.URLENC

import java.lang.reflect.Type

import com.common.Utility
import com.google.gson.reflect.TypeToken

class WebserviceController {

	def syncService
	def mongoService
	def billingService
	def inventoryService
	
	static allowedMethods = [syncBilling: ["POST", "GET"], syncInventory: ["POST", "GET"],
		updateSalesOrderStatus: ["POST", "GET"], updatePurchaseOrderStatus: ["POST", "GET"],
		insertBillDetails: ["POST", "GET"], insertPurchaseDetails: ["POST", "GET"]]

	//GsonBuilder
	def gsonBuilder
	
    def index() { }
	
	def updateSalesOrderStatus() {
		//Read parameters
		println "received params"+ params
		
		byte orderStatus = params.byte('orderStatus')
		String billId = params.billId
		
		int status = billingService.updateOrderStatus(orderStatus, billId)
		
		render (text: status)
	}
		
	def updatePurchaseOrderStatus() {
		//Read parameters
		println "received params"+ params
		
		byte orderStatus = params.byte('orderStatus')
		String invoiceId = params.invoiceId
		
		int status = inventoryService.updateOrderStatus(orderStatus, invoiceId)
		
		render (text: status)
	}
	
	def getSalesOrderStatus() {
		//Read parameters
		println "received params"+ params
		
		String billId = params.billId
		
		int status = billingService.getOrderStatus(billId)
		
		render (text: status)
	}
		
	def getPurchaseOrderStatus() {
		//Read parameters
		println "received params"+ params
		
		String inventoryId = params.inventoryId
		
		int status = inventoryService.getOrderStatus(inventoryId)
		
		render (text: status)
	}
	
	def getInventoryList() {
		//Read parameters
		println "received params"+ params
		
		ArrayList<Inventory> inventoryList = new ArrayList<Inventory>()
		inventoryList = inventoryService.getInventoryList()
		
		def gson = gsonBuilder.create()
		def json = gson.toJson(inventoryList).toString()
		
		render (text: json)
	}
	
	def getSalesList() {
		//Read parameters
		println "received params"+ params
		
		ArrayList<Billing> billingList = new ArrayList<Billing>()
		billingList = billingService.getBillingList()
		
		def gson = gsonBuilder.create()
		def json = gson.toJson(billingList).toString()
		
		render (text: json)
	}
	
	def insertBillDetails() {
		//cast parameters into arraylist
		println "received params: "+params+ " bill Details: "+params.billDetails;
		
		Type billDetailsType = new TypeToken<BillDetails>() {}.getType();
		def gson = gsonBuilder.create()
		BillDetails billDetails = gson.fromJson(params.billDetails, billDetailsType)
		
		println "list count: "+billDetails.itemDetails.size()
		
		
		//call insert action
		
		def lastUpdatedTimeStamp = syncService.insertBillDetails(billDetails)
		
		
		render (text: lastUpdatedTimeStamp)
	}
	
	def insertPurchaseDetails() {
		//cast parameters into arraylist
		println "received params: "+params+" request: "+request.toString();
		
		Type purchaseDetailsType = new TypeToken<PurchaseDetails>() {}.getType();
		def gson = gsonBuilder.create()
		PurchaseDetails purchaseDetails = gson.fromJson(params.purchaseDetails, purchaseDetailsType)
		
		println "Purchase Details list size: "+purchaseDetails.inventoryList.size()
		//call sync service
		//String lastUpdatedTimeStamp = "test"
		
		String lastUpdatedTimeStamp = syncService.insertPurchaseDetails(purchaseDetails)
		
		//return lastUpdatesTS
		render (text: lastUpdatedTimeStamp)
	}
	
	def getLastUpdatedTimeStampForBilling() {
		
		//get getLastUpdatedTimeStampForBilling from mongoservice
		def timeStamp= mongoService.getLastUpdatedTimeStampForBilling()
		render (text: timeStamp)
		
	}
	
	
		
	def getLastUpdatedTimeStampForInventory() {
		
		//get getLastUpdatedTimeStampForInventory from mongoservice
		def timeStamp= mongoService.getLastUpdatedTimeStampForInventory()
		render (text: timeStamp)
		
	}
	
	
	
	def testBillDetailsInsert() {
		println "Bill count: "+Billing.count()
		
		BillDetails billDetails = new BillDetails()
		billDetails.patient = new PatientCommand(true)
		def billCommand = new BillingCommand(true)
		
		ArrayList<BillingCommand> billList = new ArrayList<BillingCommand>()
		billList.add(billCommand)
		
		billCommand = new BillingCommand(true)
		billList.add(billCommand)
		
		billDetails.itemDetails = billList
		
		def gson = gsonBuilder.create()
		def json = gson.toJson(billDetails).toString()
		
		println "JSON: "+json
		
		redirect(action:'insertBillDetails', params:[billDetails:Utility.billingJson])
		
	}
	
	
	def testPurchaseDetailsInsert() {
		println "Item count: "+Inventory.count()
		
		def purchaseDetails = new PurchaseDetails(true) 
		
		
		def gson = gsonBuilder.create()
		def json = gson.toJson(purchaseDetails).toString()
		
		println "JSON: "+json
		
		redirect(action:'insertPurchaseDetails', params:[purchaseDetails:Utility.purchaseJson])
		
	}
}
