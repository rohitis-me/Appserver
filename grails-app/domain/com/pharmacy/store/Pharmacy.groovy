package com.pharmacy.store

class Pharmacy {
	
	long chainId
	long storeId
	String storeName
	byte type
	String addressLine1
	String addressLine2
	String circle
	String city
	String state
	String latitude
	String longitude
	

    static constraints = {
		
    }
	static mapping = {
		table "pharmacy_tbl" //schema: "SCHEMA" if it is different from the user

		id name: 'storeId', generator: 'uuid'
		
	  }
}
