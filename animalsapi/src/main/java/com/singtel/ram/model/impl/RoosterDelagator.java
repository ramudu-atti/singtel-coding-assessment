package com.singtel.ram.model.impl;

public class RoosterDelagator {

	private Chicken chicken = new Chicken();

	public boolean sing() {

		System.out.println("cock-a-doodle-doo");
		return true;
	}

	public boolean walk() {
		return chicken.walk();
	}

	public boolean swim() {
		return chicken.swim();
	}

	public boolean fly() {
		return chicken.fly();
	}
}
