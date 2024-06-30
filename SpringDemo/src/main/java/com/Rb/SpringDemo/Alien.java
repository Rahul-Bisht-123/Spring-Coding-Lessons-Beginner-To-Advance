package com.Rb.SpringDemo;

public class Alien{
	
	private int age;
	private Computer comp;

	public Alien() {
		System.out.println("in Alien default constructor..");
	}
	

	public Alien(int age, Computer comp) {
		System.out.println("in Alien para constructor..");
		this.age = age;
		this.comp = comp;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		System.out.println("in alien setter");
		this.age = age;
	}
	
	
	
	public Computer getComp() {
		return comp;
	}


	public void setComp(Computer comp) {
		this.comp = comp;
	}


	public void code() {
		comp.compile();
	}

}
