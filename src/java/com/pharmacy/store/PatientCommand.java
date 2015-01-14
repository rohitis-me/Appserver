/**
 * 
 */
package com.pharmacy.store;

/**
 * @author Rohit2
 *
 */
public class PatientCommand {

	String patientId;
	String patientCode;
	String name;
	String doctorName;
	int age;
	String addressLine1;
	String addressLine2;
	String circle;
	String city;
	String state;
	/**
	 * @param patientId
	 * @param patientCode
	 * @param name
	 * @param doctorName
	 * @param age
	 * @param addressLine1
	 * @param addressLine2
	 * @param circle
	 * @param city
	 * @param state
	 */
	public PatientCommand(String patientId, String patientCode, String name,
			String doctorName, int age, String addressLine1,
			String addressLine2, String circle, String city, String state) {
		super();
		this.patientId = patientId;
		this.patientCode = patientCode;
		this.name = name;
		this.doctorName = doctorName;
		this.age = age;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.circle = circle;
		this.city = city;
		this.state = state;
	}
	
	public PatientCommand(boolean chk) {
		super();
		if(chk) {
		this.patientId = "";
		this.patientCode = "Code"+ Math.random();
		this.name = "name"+ Math.random();
		this.doctorName = "doc"+ Math.random();
		this.age = 23;
		this.addressLine1 = "add1"+ Math.random();
		this.addressLine2 = "add2"+ Math.random();
		this.circle = "circle"+ Math.random();
		this.city = "city"+ Math.random();
		this.state = "state"+ Math.random();
		}
	}
	
	public PatientCommand() {
		super();
		this.patientId = "";
		this.patientCode = "";
		this.name = "";
		this.doctorName = "";
		this.age = 0;
		this.addressLine1 = "";
		this.addressLine2 = "";
		this.circle = "";
		this.city = "";
		this.state = "";
	}
	
	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the patientCode
	 */
	public String getPatientCode() {
		return patientCode;
	}
	/**
	 * @param patientCode the patientCode to set
	 */
	public void setPatientCode(String patientCode) {
		this.patientCode = patientCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	
}
