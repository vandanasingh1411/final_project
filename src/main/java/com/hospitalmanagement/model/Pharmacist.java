package com.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pharmacist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	@Column(name="FirstName")
	private String firstname;
	@Column(name="LastName")
	private String lastname;
	@Column(name="UserName")
	private String username;
	@Column(name="EmailId")
	private String emailid;
	@Column(name="Password")
	private String password;
	@Column(name="Age")
    private int age;
	@Column(name="MobileNo")
	private String mobileno;
	@Column(name="Street")
	private String street;
	@Column(name="City")
	private String city;
	@Column(name="Pincode")
	private String pincode;
	@Column(name="RegisterDate")
	private String registerdate;

}
