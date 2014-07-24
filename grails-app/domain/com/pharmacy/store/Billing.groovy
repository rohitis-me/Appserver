package com.pharmacy.store

class Billing {

	String billingId
	long billingNumber
	String storeId
	long brandId
	String batch
	Date billingTime
	int quantity
	int discount
	int sellingPrice
	boolean isDeleted
	long lastUpdatedTimeStamp
	
    static constraints = {
    }
}
