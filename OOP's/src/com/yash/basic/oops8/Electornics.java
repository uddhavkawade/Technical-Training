package com.yash.basic.oops8;

import java.util.Date;

public class Electornics
{
private	int id;
private String semiconductorType;
private Date dateOfManufacturing;
public Electornics(int id, String semiconductorType, Date dateOfManufacturing) {
	super();
	this.id = id;
	this.semiconductorType = semiconductorType;
	this.dateOfManufacturing = dateOfManufacturing;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSemiconductorType() {
	return semiconductorType;
}
public void setSemiconductorType(String semiconductorType) {
	this.semiconductorType = semiconductorType;
}
public Date getDateOfManufacturing() {
	return dateOfManufacturing;
}
public void setDateOfManufacturing(Date dateOfManufacturing) {
	this.dateOfManufacturing = dateOfManufacturing;
}

void printElectronicDetails()
{
   System.out.println("Electronic ID : "+id+"\n Semi Conductor Type : "+semiconductorType+"Date of Manufutre : "+dateOfManufacturing);	
}
}
