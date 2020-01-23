package com.singtel.ram.model.impl;

import com.singtel.ram.model.Animal;
import com.singtel.ram.model.Swimmable;

public class Fish extends Animal implements Swimmable {

	private String size;
	private String color;
	
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean sing() {
		System.out.println("I can not sing");
		return false;
	}

	@Override
	public boolean fly() {
		System.out.println("I can not fly");
		return false;
	}

	@Override
	public boolean swim() {
		System.out.println("I can Swim");
		return true;
	}

	@Override
	public boolean walk() {
		System.out.println("I  dont walk");
		return false;
	}

	
	
}
