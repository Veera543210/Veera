package com.skilllogic.Springprg.beans;

public class AddressEmployee {
private String Dno;
private String Area;
private String City;
public void setDno(String dno) {
	Dno = dno;
}
public void setArea(String area) {
	Area = area;
}
public void setCity(String city) {
	City = city;
}
public void display() {
	System.out.println("Door number "+Dno);
	System.out.println("Area "+Area);
	System.out.println("City "+City);
}
}
