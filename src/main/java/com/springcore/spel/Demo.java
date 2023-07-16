package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	//SpEL
	@Value("#{22+11}")
	private int x;
	
	@Value("#{2+5+56+34}")
	private int y;
	
	//SpEL static method
	@Value("#{T(java.lang.Math).sqrt(25.0) }")
	private double z;
	
	//SpEL static variable
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	//SpEL object creation
	@Value("#{new java.lang.String('Rehan')}")
	private String name; 
	
	//SpEL boolean
	@Value("#{ 8<3 }")
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}


	

}
