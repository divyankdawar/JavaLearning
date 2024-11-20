package interviewPrep;

import java.util.Date;

public class Passenger {
	private String lastName;
	private String zipCode;
	private Date dob;
	
	//Constructor
	public Passenger(String lastName,String zipCode, Date dob) {
		this.lastName = lastName;
		this.zipCode = zipCode;
		this.dob = dob; 
	}
	
	//Getters and Setters
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName; 
	}
	 public String getZipCode() {
		 return zipCode;
	 }
	 public void setZipCode(String zipCode) {
		 this.zipCode = zipCode;
	 }
	 
	 public Date getDob() {
		 return dob;
	 }
	 public void setDob(Date dob) {
		 this.dob = dob;
	 }
	 
	 public String toString() {
		 return "Passenger{" +
	            "lastName='" + lastName + '\'' +
	            ", zipCode='" + zipCode + '\'' +
	            ",dob=" + dob +
	            '}';
	 }
	 
	 
	
	
	
	

}
