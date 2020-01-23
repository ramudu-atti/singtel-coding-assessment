package com.singtel.ram.model.impl;

import com.singtel.ram.consts.ButterflyStage;
import com.singtel.ram.model.Animal;

/**
 * Default butterfly stage is set to EGG
 * 
 * @author ramssweety
 *
 */
public class Butterfly extends Animal {

	private ButterflyStage stage;

	public Butterfly() {
		this.setStage(ButterflyStage.EGG);
	}

	@Override
	public boolean sing() {
		return false;
	}

	@Override
	public boolean fly() {

		if (this.getStage() == ButterflyStage.BUTTERFLY) {
			System.out.println("I can fly");
			return true;
		}
		return false;
	}

	@Override
	public boolean walk() {

		if (this.getStage() == ButterflyStage.BUTTERFLY || this.getStage() == ButterflyStage.CATERPILLAR) {
			System.out.println("I can walk");
			return true;
		}
		return false;

	}

	public ButterflyStage getStage() {
		return stage;
	}

	public void setStage(ButterflyStage stage) {
		this.stage = stage;
	}

	public void transformStage(ButterflyStage target) {
		if (this.getStage() != ButterflyStage.BUTTERFLY && target == ButterflyStage.BUTTERFLY) {
			this.setStage(ButterflyStage.BUTTERFLY);
		}
	}

}
