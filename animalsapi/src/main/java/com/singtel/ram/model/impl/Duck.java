package com.singtel.ram.model.impl;

import com.singtel.ram.model.Swimmable;

public class Duck extends Bird implements Swimmable {

	@Override
	public boolean sing() {
		System.out.println("Quack, quack");
		return true;
	}

	public boolean swim() {
		System.out.println("Duck can swim");
		return true;
	}
}
