package com.singtel.ram.model.impl;

import com.singtel.ram.model.Animal;
/**
 * 
 * @author ramudu
 *
 */
public class Parrot extends Bird {

	private Animal livingWithAnimal;

	public Parrot() {

	}

	public boolean sing() {
		if (this.getLivingWithAnimal() == null)
			this.setLivingWithAnimal(new Duck());

		return this.getLivingWithAnimal().sing();
	}

	public Animal getLivingWithAnimal() {
		return livingWithAnimal;
	}

	public void setLivingWithAnimal(Animal livingWithAnimal) {
		this.livingWithAnimal = livingWithAnimal;
	}

}
