package com.singtel.ram.model.impl;

import com.singtel.ram.model.Animal;

public class Cat extends Animal {

	@Override
	public boolean sing() {
		System.out.println("Meow");
		return true;
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public boolean swim() {
		return false;
	}

}
