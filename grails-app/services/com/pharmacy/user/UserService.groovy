package com.pharmacy.user

import grails.transaction.Transactional

@Transactional
class UserService {
	
	def springSecurityService

    def serviceMethod() {

    }
	
	def getStoreId() {
		def userId = springSecurityService.getCurrentUser().id
		def userProfile = UserProfile.findByUserId(userId)
		return userProfile.pharmacyId
	}
}
