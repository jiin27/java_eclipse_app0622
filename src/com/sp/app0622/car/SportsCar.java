package com.sp.app0622.car;

public class SportsCar {
	String color="none color";
	
	public SportsCar() {
		color="black";
	}
	
	public void setColor() {
		color="red";
	}
	
	public static void main(String[] args) {
		SportsCar s=new SportsCar();
		s.setColor();
		System.out.println(s.color);
	}
}

