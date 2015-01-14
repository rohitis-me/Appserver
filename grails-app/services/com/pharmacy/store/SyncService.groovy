package com.pharmacy.store

import grails.transaction.Transactional

import com.common.Utility

@Transactional
class SyncService {

	def mongoService
	def userService
	def patientService
	def inventoryService
	
    def serviceMethod() {

    }

	//Bill
		
	def insertBillDetails(BillDetails billDetails) {
		ArrayList<BillingCommand> billList = billDetails.getItemDetails()
		PatientCommand patientCommand = billDetails.getPatient()
		def patientId = patientService.insertPatient(patientCommand)
		
		//println "patientId: "+patientId
		
		long updateTimeStamp = 0
		
		billList.each{ billCommandInstance->
			updateTimeStamp = insertOrUpdateBill(billCommandInstance, patientId)
		}
		return updateTimeStamp
	}
	
	def syncBilling(ArrayList<BillingCommand> billList) {
		int status =0
		def storeId
		log.info "in syncBilling"
		BillingCommand billCommand = new BillingCommand()
		
		billList.each { bill->
			billCommand = Utility.populateIdFieldsForBill(bill)
			status= mongoService.insertOrUpdateBill(billCommand)
		}
		println "storeid: "+storeId
		return mongoService.getLastUpdatedTimeStampForBilling(storeId)
	}	
	
	def insertOrUpdateBill(BillingCommand billInstance, String patientId) {
		int status =0
		
		BillingCommand billCommand = Utility.populateIdFieldsForBill(billInstance, patientId)
			status= mongoService.insertOrUpdateBill(billCommand)
			def storeId = billCommand.getStoreId()
		
		println "storeid: "+storeId
		return mongoService.getLastUpdatedTimeStampForBilling(storeId)
	}
	
	//Inventory
	def syncInventory(ArrayList<InventoryCommand> inventoryList) {
		int status =0
		def storeId
		
		InventoryCommand inventoryCommand = new InventoryCommand()
		
		inventoryList.each { item->
			inventoryCommand = Utility.populateIdFieldsForInventory(item)
			status= mongoService.insertOrUpdateInventory(inventoryCommand)
			storeId = item.getStoreId()
		}
		
		println "storeid: "+storeId
		return mongoService.getLastUpdatedTimeStampForInventory(storeId)
	}
	
	def insertPurchaseDetails(PurchaseDetails purchaseDetails) {
		ArrayList<InventoryCommand> inventoryList = purchaseDetails.getInventoryList()
		InvoiceDetails invoiceDetails = purchaseDetails.getInvoiceData()
		
		def invoiceId = inventoryService.insertInvoiceDetails(invoiceDetails)
		
		long updateTimeStamp = 0
		
		inventoryList.each{ inventoryInstance->
			updateTimeStamp = insertOrUpdateInventory(inventoryInstance, invoiceId)
		}
		return updateTimeStamp
	}
	
	def insertOrUpdateInventory(InventoryCommand inventoryInstance, String invoiceId) {
		int status =0
		
		InventoryCommand inventoryCommand = Utility.populateIdFieldsForInventory(inventoryInstance, invoiceId)
			status= mongoService.insertOrUpdateInventory(inventoryCommand)
			def storeId = Utility.getStoreId(inventoryCommand)
		
		println "storeid: "+storeId
		return mongoService.getLastUpdatedTimeStampForInventory(storeId)
	}
	
}
