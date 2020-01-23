package com.singtel.ram.model.impl;

public class ClownFish extends Fish {

	public ClownFish() {
		super.setSize("small");
		super.setColor("orange");

	}

	public ClownFish(String size, String color) {
		if ("small".equalsIgnoreCase(size) && "orange".equalsIgnoreCase(color)) {
			super.setSize(size);
			super.setColor(color);
		} else {
			throw new IllegalArgumentException("Invalid size and color ,expected is small size and orange color");
		}

	}

	public boolean canMakeJokes() {
		System.out.println("I can make jokes");
		return true;
	}

	public boolean canEatOtherFish() {
		return false;
	}

}
