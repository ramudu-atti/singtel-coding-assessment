package com.singtel.ram.model.impl;

import com.singtel.ram.model.Animal;

/**
 * 
 * @author ramudu
 *
 */
public class Bird extends Animal {

	public boolean sing() {
		System.out.println("I am singing");
		return true;
	}

	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	public boolean swim() {
		System.out.println("I can not swim");
		return false;
	}

	

	
}
