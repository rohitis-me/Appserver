package com.pharmacy.store

class Distributor {
	
	String distributorId
	String distributorTIN
	String AddressLine1
	String AddressLine2
	String circle
	String city
	String state
	String pinCode
	String phoneNumber1
	String phoneNumber2
	
    static constraints = {
//		distributorTIN size: 3..20, blank: false, nullable:false
//		AddressLine1 size: 3..50, blank: true, nullable: true
//		AddressLine2 size: 3..50, blank: true, nullable: true
//		circle size: 3..50, blank: true, nullable: true
    }
	
	static mapping = {
		id name: 'distributorId', generator:'assigned'
	}
}
