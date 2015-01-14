package com.pharmacy.store

class Patient {

	String patientId
	String patientCode
	String name
	String doctorName
	int age
	String addressLine1
	String addressLine2
	String circle
	String city
	String state
	
    static constraints = {
    }
	
	static mapping = {
		id name: 'patientId', generator:'assigned'
	}
}
