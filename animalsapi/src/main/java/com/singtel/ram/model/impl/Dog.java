package com.singtel.ram.model.impl;

import com.singtel.ram.model.Animal;

public class Dog extends Animal{

	public boolean swim() {
		return false;
	}

	@Override
	public boolean sing() {
		System.out.println("Woof, woof");
		return true;
	}

	@Override
	public boolean fly() {
		return false;
	}

}
