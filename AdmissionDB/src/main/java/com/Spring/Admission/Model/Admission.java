package com.Spring.Admission.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admission {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String surname;
private String city;
private double cellNo;
private double mark;
private String email;
public Admission() {
	
}

public Admission(String name, String surname, String city, double cellNo, double mark, String email) {
	super();
	this.name = name;
	this.surname = surname;
	this.city = city;
	this.cellNo = cellNo;
	this.mark = mark;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getCellNo() {
	return cellNo;
}
public void setCellNo(double cellNo) {
	this.cellNo = cellNo;
}
public double getMark() {
	return mark;
}
public void setMark(double mark) {
	this.mark = mark;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}




}
