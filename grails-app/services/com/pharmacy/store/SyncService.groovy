package com.pharmacy.store

import grails.transaction.Transactional

@Transactional
class SyncService {

	def mongoService
	def userService
	
    def serviceMethod() {

    }
	
	def syncBilling(ArrayList<BillingCommand> billList) {
		int status =0
		def storeId
		log.info "in syncBilling"
		billList.each { bill->
			status= mongoService.insertOrUpdateBill(bill)
			storeId = bill.getStoreId()
		}
//		def storeId = userService.getStoreId()
		println "storeid: "+storeId
		return mongoService.getLastUpdatedTimeStampForBilling(storeId)
	}
	
	def syncInventory(ArrayList<InventoryCommand> inventoryList) {
		int status =0
		def storeId
		
		inventoryList.each { item->
			status= mongoService.insertOrUpdateInventory(item)
			storeId = item.getStoreId()
		}
		
//		def storeId = userService.getStoreId()
		println "storeid: "+storeId
		return mongoService.getLastUpdatedTimeStampForInventory(storeId)
	}
	
}
