/**
 * 
 */
package com.pharmacy.store;

import java.util.ArrayList;

/**
 * @author Rohit2
 *
 */
public class BillDetails {

	PatientCommand patient;
	ArrayList<BillingCommand> itemDetails;
	/**
	 * @param patient
	 * @param itemDetails
	 */
	public BillDetails(PatientCommand patient,
			ArrayList<BillingCommand> itemDetails) {
		super();
		this.patient = patient;
		this.itemDetails = itemDetails;
	}
	
	public BillDetails() {
		super();
		this.patient = new PatientCommand();
		this.itemDetails = new ArrayList<BillingCommand>();
	}
	
	/**
	 * @return the patient
	 */
	public PatientCommand getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(PatientCommand patient) {
		this.patient = patient;
	}
	/**
	 * @return the itemDetails
	 */
	public ArrayList<BillingCommand> getItemDetails() {
		return itemDetails;
	}
	/**
	 * @param itemDetails the itemDetails to set
	 */
	public void setItemDetails(ArrayList<BillingCommand> itemDetails) {
		this.itemDetails = itemDetails;
	}
	
}
