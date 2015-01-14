package com.pharmacy.store

class Inventory {

	String inventoryId
	String brandId
	String storeId
	String batch
	Date expiry
	double unitCost
	double mrp
	double VAT
	int quantity
	double discountAmount
	int itemsPerUnit
	int itemsRemaining
	int numberOfUnitsPurchased
	boolean isDeleted
	long lastUpdatedTimeStamp
	String invoiceId
	String brandName
	
	
    static constraints = {
    }
	
	static mapping = {
		id name: 'inventoryId', generator:'assigned'
	}
}
