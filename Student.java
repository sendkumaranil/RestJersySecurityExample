package com.restsecurity.declarative.example.model;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Student {
 String firstName, lastName;
 String school;
 int id;
 int standard;
  
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
 
@Override
public String toString(){
	
	if(id>0 && standard>0)
		return firstName+" "+lastName+"is a student of "+school+" with rollNumber: "+ id+" in satndard: "+ standard;
	else if(standard>0)
		return firstName+" "+lastName+"is a student of "+school+" in satndard: "+ standard;
	else if(id>0)
		return firstName+" "+lastName+"is a student of "+school+" with rollNumber: "+ id;
	else
	    return firstName+" "+lastName+"is a student of "+school;
}
 
}
