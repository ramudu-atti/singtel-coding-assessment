package com.singtel.ram.model;
/**
 * 
 * @author ramudu
 *
 */
public abstract class Animal implements Flyable, Walkable, Swimmable {

	public abstract boolean sing();

	public abstract boolean fly();

	public boolean swim() {
		return false;
	}

	public boolean walk() {
		System.out.println("I am walking");
		return true;

	}

}
