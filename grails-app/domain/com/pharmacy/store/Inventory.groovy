package com.pharmacy.store

class Inventory {

	String inventoryId
	long brandId
	String storeId
	String batch
	Date expiry
	int unitCost
	int mrp
	int quantity
	int discount
	int itemsPerUnit
	boolean isDeleted
	long lastUpdatedTimeStamp
	
    static constraints = {
    }
}
