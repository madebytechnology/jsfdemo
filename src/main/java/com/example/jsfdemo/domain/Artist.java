package com.example.jsfdemo.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Artist {
		
	private String name; //nazwa
	private int yof; //data zalozenia zespolu
	private String nameofcd; //nazwa cd
	private int yop;
	private String number; //numer plyty
	private double price; //cena ostatniej płyty
	//miejsce na boolean	
	
	
	public Artist(String name, int yof, String nameofcd, int yop, String number,
			double price) {
		super();
		this.name = name;
		this.yof = yof;
		this.nameofcd = nameofcd;
		this.yop = yop;
		this.number = number;
		this.price = price;
	}
	
	public Artist() {
		
		
	}

	@Size(min = 2, max = 40)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getYof() {
		return yof;
	}
	public void setYof(int yof) {
		this.yof = yof;
	}
	
	
	public String getNameofcd() {
		return nameofcd;
	}
	public void setNameofcd(String nameofcd) {
		this.nameofcd = nameofcd;
	}
	
	   public int getYop() {
			return yop;
		}
		public void setYop(int yop) {
			this.yop = yop;
		}
	
	//@Pattern(regexp = "[0-9]{2}-[A-Z]{4}-[0-9]{2}")	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		
 

	
	}
	
