package com.pharmacy.store

import grails.transaction.Transactional

import com.common.Utility

@Transactional
class BillingService {

	def userService
	
    def serviceMethod() {

    }
	
	def updateOrderStatus(byte orderStatus, String billId) {
		Billing bill = Billing.findByBillingId(billId)
		
		
		if(!bill) {
			//FIXME this is a temp fix
			bill = Billing.first()
			//return 0
		} 
		
		 
		bill?.orderStatus = orderStatus
		if(bill && bill.save(flush:true)) {
			log.info "Bill order status changed"
			return 1
		}
		else {
			log.error "Error in BillingService.updateOrderStatus "
			bill.errors.each { it->
				log.error ""+it
			}
			return 0
		}
	}
	
	def getOrderStatus(String billId) {
		Billing bill = Billing.findByBillingId(billId)
		
		if(!bill) {
			//FIXME this is a temp fix
			bill = Billing.first()
			println "Bill count: "+Billing.count()+"\nBill: "+Billing
		}
		
			return bill.orderStatus
		
	}
	
	//Get request services
	
	def getBillingList() {
		def storeId = userService.getStoreId(false)
		List billList = new ArrayList<Billing>()
		
		if(! Utility.isStringEmptyWhiteSpaceOrNull(storeId))
		billList = Billing.findAllByStoreId(storeId)//getAllByStoreId(storeId)
		
		return billList
	}
}
