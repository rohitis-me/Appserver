package com.pharmacy.user

import grails.transaction.Transactional

import com.pharmacy.store.Billing
import com.pharmacy.store.Inventory

@Transactional
class UserService {
	
	def springSecurityService

    def serviceMethod() {

    }
	
	def getStoreId(boolean chk = true) {
//		def userId = springSecurityService.getCurrentUser().id
//		def userProfile = UserProfile.findByUserId(userId)
		
		//FIXME: Below is a temp fix
		if(chk){
			Inventory inventory = Inventory.first()
			if(inventory)
			return inventory.storeId
			else
			return ""
		}
		else {
			Billing bill = Billing.first()
			if(bill)
			return bill.storeId
			else
			return ""
		}
		
//		return userProfile.pharmacyId
	}
}
