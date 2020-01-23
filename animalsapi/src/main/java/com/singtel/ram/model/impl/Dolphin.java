package com.singtel.ram.model.impl;

import com.singtel.ram.model.Animal;
import com.singtel.ram.model.Swimmable;

/**
 * 1. This can be implemented without using inheritence by holding a property of
 * fish type and checking the fish behavior and invoking fish methods or
 * directly extending Animal and implementing swim method.
 * 
 * @author ramudu
 *
 */
public class Dolphin extends Animal implements Swimmable{

	private Fish fish;

	public void setFishBehvior(Fish fish) {
		this.fish = fish;
	}

	@Override
	public boolean sing() {
		return fish.sing();
	}

	@Override
	public boolean fly() {
		return fish.fly();
	}

	@Override
	public boolean walk() {
		return fish.walk();
	}

	@Override
	public boolean swim() {
		return fish.swim();
	}

}
