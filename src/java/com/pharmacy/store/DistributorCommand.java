/**
 * 
 */
package com.pharmacy.store;

import com.common.Utility;

/**
 * @author Rohit2
 *
 */
public class DistributorCommand {

	String distributorId;
	String distributorTIN;
	String AddressLine1;
	String AddressLine2;
	String circle;
	String city;
	String state;
	String pinCode;
	String phoneNumber1;
	String phoneNumber2;
	
	
	/**
	 * @param distributorId
	 * @param distributorTIN
	 * @param addressLine1
	 * @param addressLine2
	 * @param circle
	 * @param city
	 * @param state
	 * @param pinCode
	 * @param phoneNumber1
	 * @param phoneNumber2
	 */
	public DistributorCommand(String distributorId, String distributorTIN,
			String addressLine1, String addressLine2, String circle,
			String city, String state, String pinCode, String phoneNumber1,
			String phoneNumber2) {
		super();
		this.distributorId = distributorId;
		this.distributorTIN = distributorTIN;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		this.circle = circle;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.phoneNumber1 = phoneNumber1;
		this.phoneNumber2 = phoneNumber2;
	}
	
	public DistributorCommand(boolean check) {
		super();
		if(check) {
		this.distributorId = Utility.getDistributor();
		this.distributorTIN = ""+Math.random();
		AddressLine1 = ""+Math.random();
		AddressLine2 = ""+Math.random();
		this.circle = ""+Math.random();
		this.city = ""+Math.random();
		this.state = ""+Math.random();
		this.pinCode = ""+Math.random();
		this.phoneNumber1 = ""+Math.random();
		this.phoneNumber2 = ""+Math.random();
		}
	}
	
	public DistributorCommand() {
		super();
	}
	/**
	 * @return the distributorId
	 */
	public String getDistributorId() {
		return distributorId;
	}
	/**
	 * @param distributorId the distributorId to set
	 */
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	/**
	 * @return the distributorTIN
	 */
	public String getDistributorTIN() {
		return distributorTIN;
	}
	/**
	 * @param distributorTIN the distributorTIN to set
	 */
	public void setDistributorTIN(String distributorTIN) {
		this.distributorTIN = distributorTIN;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return AddressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return AddressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	/**
	 * @return the circle
	 */
	public String getCircle() {
		return circle;
	}
	/**
	 * @param circle the circle to set
	 */
	public void setCircle(String circle) {
		this.circle = circle;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * @return the phoneNumber1
	 */
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	/**
	 * @param phoneNumber1 the phoneNumber1 to set
	 */
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	/**
	 * @return the phoneNumber2
	 */
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	/**
	 * @param phoneNumber2 the phoneNumber2 to set
	 */
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	
}
