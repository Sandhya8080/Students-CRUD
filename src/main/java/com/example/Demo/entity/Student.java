package com.example.Demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="student")
public class Student {
@Id
private int RollNo;
private String name;
private String Address;
 
public Student() {
	super();
	//TODO Auto-generated constructor stub
}

public Student(int RollNo, String name, String address) {
	super();
	this.RollNo = RollNo;
	this.name = name;
	this.Address = address;
}

public int getRollNo() {
	return RollNo;
}

public void setRollNo(int rollNo) {
	this.RollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

}
