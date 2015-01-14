package com.pharmacy.store

import grails.transaction.Transactional

import com.common.Utility


@Transactional
class MongoService {

    def serviceMethod() {

    }
	
	def getCurrentDate() {
		return (new Date())
	}
	
	//Methods for billing
	
	def insertOrUpdateBill(BillingCommand bill) {
		log.info "in insertOrUpdateBill"
		if(validateBill(bill)) {
			def billing= new Billing()
			billing= Utility.populateBillingFromBillingCommand(billing, bill)
			if(billing.save(flush:true)) {
				log.info "Billing saved: "+billing.properties
				return 1
			} else {
			log.error "Billing NOT saved: "
			billing.errors.each{it->
				log.error "error: "+it
			}
			return 0
			}
			
		} else {
		  println "BILL NOT VALID: "+bill
		  return 0
		}
	}
	
	def getLastUpdatedTimeStampForBilling(String storeId) {
		//println "STOREID: "+storeId
		Billing bill = Billing.findByStoreId(storeId, [sort:"lastUpdatedTimeStamp", order: "desc"])
		long timeStamp = bill?.lastUpdatedTimeStamp?:0
		log.info "timestamp: "+timeStamp+" billList: "+bill+" billing count: "+Billing.count()
		return timeStamp
		
	}
	
	private boolean validateBill(BillingCommand bill) {
		//validate billing fields
		boolean isValid= true;
		
		if(bill.getBillingTime()> getCurrentDate()) {
			isValid = false
		}
		if(bill.getQuantity()< 0) {
			isValid = false
		}
		 
		return isValid
	}
	
	
	//Methods for inventory
	
	def insertOrUpdateInventory(InventoryCommand item) {
		if(validateInventory(item)) {
			log.info "ITEM valid"
			def inventory= new Inventory()
			inventory= Utility.populateInventoryFromInventoryCommand(inventory, item)
			if(inventory.save(flush:true)) {
				log.info "Item saved: "+item.properties
				return 1
			} else {
				log.error "Item NOT saved"
				inventory.errors.each {it->
					println "Error in Mongo service insertOrUpdateInventory"+it
				}
				return 0
			}
		}
	}
	
	def getLastUpdatedTimeStampForInventory(String storeId) {
		log.info "storeid: "+storeId
		
		Inventory item = Inventory.findByStoreId(storeId, [sort:"lastUpdatedTimeStamp", order: "desc"])
		long timeStamp = item?.lastUpdatedTimeStamp?:0
		return timeStamp
	}
	
	private boolean validateInventory(InventoryCommand item) {
		//validate inventory fields
		boolean isValid= true;
		
		if(item.getItemsPerUnit() < 0) {
			isValid = false
		}
		if(item.getQuantity()< 0) {
			isValid = false
		}
		 
		return isValid
	}
	
	
	
	
}
