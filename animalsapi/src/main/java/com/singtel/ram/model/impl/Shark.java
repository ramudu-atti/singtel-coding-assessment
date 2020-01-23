package com.singtel.ram.model.impl;

public class Shark extends Fish {
	public Shark() {
		super.setSize("large");
		super.setColor("grey");

	}

	public Shark(String size, String color) {
		if ("large".equalsIgnoreCase(size) && "grey".equalsIgnoreCase(color)) {
			super.setSize(size);
			super.setColor(color);
		} else {
			throw new IllegalArgumentException("Invalid size and color ,expected is large size and grey color");
		}

	}

	public boolean canMakeJokes() {
		return false;
	}

	public boolean canEatOtherFish() {
		System.out.println("I can eat other fish");
		return true;
	}

}
