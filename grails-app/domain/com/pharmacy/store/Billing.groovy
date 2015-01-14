
package com.pharmacy.store

class Billing {

	String billingId
	String billingNumber
	String storeId
	Date billingTime
	int quantity
	double discountAmount
	double finalAmount
//	double sellingPrice
	boolean isDeleted
	long lastUpdatedTimeStamp
	String inventoryId
	String patientId
	double vatAmount
	byte orderStatus
	byte paymentType
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
    }
	
	static mapping = {
		id name: 'billingId', generator:'assigned'
		autotimestamp: "true"
	}
}
