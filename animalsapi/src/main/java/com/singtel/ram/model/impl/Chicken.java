package com.singtel.ram.model.impl;

public class Chicken extends Bird{

	@Override 
	public boolean sing() {
		System.out.println("Cluck, Cluck");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("I can not fly");
		return false;
	}

	
}
