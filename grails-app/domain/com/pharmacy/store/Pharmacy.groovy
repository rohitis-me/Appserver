package com.pharmacy.store

class Pharmacy {
	
	long chainId
	long storeId
	String storeName
	long type
	String address
	String city
	String state
	String circle
	String latitude
	String longitude

    static constraints = {
		
    }
	static mapping = {
		table "pharmacy_tbl" //schema: "SCHEMA" if it is different from the user

		id name: 'storeId'
		
	  }
}
