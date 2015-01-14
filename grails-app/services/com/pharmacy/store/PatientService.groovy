package com.pharmacy.store

import grails.transaction.Transactional

import com.common.Utility

@Transactional
class PatientService {

    def serviceMethod() {

    }
	
	def insertPatient(PatientCommand patientCommand) {
		patientCommand = populateIdForPatient(patientCommand);
		//println "PS insertPatient: "+patientCommand.patientId
		Patient patient = populatePatientFromPatientCommand(patientCommand)
		if(patient.save(flush:true)) {
			return patient.patientId
		}
		else {
			patient.errors.each{it->
				println "Error: "+it
			}
			return null
		}
	}
	
	def populatePatientFromPatientCommand(PatientCommand patientCommand) {
		Patient patient = new Patient()
		patient.patientId = patientCommand.getPatientId()
		patient.patientCode = patientCommand.getPatientCode()
		patient.name = patientCommand.getPatientCode()
		patient.doctorName = patientCommand.getDoctorName()
		patient.age = patientCommand.getAge()
		patient.addressLine1 = patientCommand.getAddressLine1()
		patient.addressLine2 = patientCommand.getAddressLine2()
		patient.circle = patientCommand.getCircle()
		patient.city = patientCommand.getCity()
		patient.state = patientCommand.getState()
		return patient
//	String circle
//	String city
//	String state
	}
	
	private PatientCommand populateIdForPatient(PatientCommand patientCommand) {
//		String patientId = patientCommand.patientId
		if(Utility.isStringEmptyWhiteSpaceOrNull(patientCommand.patientId)) {
			patientCommand.setPatientId(Utility.generateNewPatientId())
		}
		return patientCommand
	}
}
