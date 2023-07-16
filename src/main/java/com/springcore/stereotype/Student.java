package com.springcore.stereotype;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Rehan")
	private String studentName;
	@Value("Kolkata")
	private String city;
	
	@Value("#{temp}")
	private List<String> adress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<String> getAdress() {
		return adress;
	}
	public void setAdress(List<String> adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	

}
