package com.tns.ifet.placementmanagenmentsystem.college.entity;

public class College {
	import jakarta.persistence.*;
	import jakarta.validation.constraints.*;

	@Entity
	@Table(name = "colleges")
	public class College {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;  // College ID (Primary Key)

	    @Column(nullable = false)
	    @Size(min = 3, max = 100, message = "College name should be between 3 to 100 characters")
	    private String name;  // College Name

	    @Column(nullable = false, unique = true)
	    @Pattern(regexp = "^[A-Za-z0-9]{5,10}$", message = "Invalid college code")
	    private String collegeCode;  // Unique College Code

	    @Column(nullable = false)
	    private String address;  // College Address

	    @Column(nullable = false)
	    private String city;  // City

	    @Column(nullable = false)
	    private String state;  // State

	    @Column(nullable = false)
	    @Pattern(regexp = "^[0-9]{6}$", message = "Invalid PIN code")
	    private String pinCode;  // PIN Code

	    @Column(nullable = false, unique = true)
	    @Email(message = "Invalid email format")
	    private String email;  // College Email (Unique)

	    @Column(nullable = false)
	    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number")
	    private String phoneNumber;  // College Contact Number

	    // Constructors
	    public College() {}

	    public College(Long id, String name, String collegeCode, String address, String city, String state, String pinCode, String email, String phoneNumber) {
	        this.id = id;
	        this.name = name;
	        this.collegeCode = collegeCode;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.pinCode = pinCode;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCollegeCode() {
	        return collegeCode;
	    }

	    public void setCollegeCode(String collegeCode) {
	        this.collegeCode = collegeCode;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getPinCode() {
	        return pinCode;
	    }

	    public void setPinCode(String pinCode) {
	        this.pinCode = pinCode;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }
	    // Overridden toString() Method
	    @Override
	    public String toString() {
	        return "College{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", collegeCode='" + collegeCode + '\'' +
	                ", address='" + address + '\'' +
	                ", city='" + city + '\'' +
	                ", state='" + state + '\'' +
	                ", pinCode='" + pinCode + '\'' +
	                ", email='" + email + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                '}';
	    }
	}


}
