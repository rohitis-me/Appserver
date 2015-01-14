package com.pharmacy.store

class Invoice {

	String invoiceId
	Date invoiceDate
	String invoiceCode
	long invoiceNumber
	String distributorId
	byte orderStatus
	byte paymentType
	
    static constraints = {
    }
	
	static mapping = {
		id name: 'invoiceId', generator:'assigned'
	}
}
