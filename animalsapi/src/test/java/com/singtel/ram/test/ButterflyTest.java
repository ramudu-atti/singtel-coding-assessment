package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.consts.ButterflyStage;
import com.singtel.ram.model.Animal;
import com.singtel.ram.model.impl.Butterfly;

public class ButterflyTest {

	@Test
	public void testButterFlyCanFlyInEggOrCaterPillerStage() {
		Butterfly fly = new Butterfly();
		assertFalse(fly.fly());// can not fly as it is in EGG stage
	}

	@Test
	public void testButterFlyCanFlyInButterflyStage() {
		Butterfly fly = new Butterfly();
		fly.setStage(ButterflyStage.BUTTERFLY);
		assertTrue(fly.fly());// can not fly as it is in EGG stage
	}

	@Test
	public void testButterFlyCanFlyCanWalk() {
		Butterfly fly = new Butterfly();
		fly.setStage(ButterflyStage.BUTTERFLY);
		assertTrue(fly.walk());// can not fly as it is in EGG stage
	}

	@Test
	public void testButterFlyCanWalkInCaterPillarStage() {
		Butterfly fly = new Butterfly();
		fly.setStage(ButterflyStage.CATERPILLAR);
		assertTrue(fly.walk());// can not fly as it is in EGG stage
	}

	@Test
	public void testButterFlyCanNotSing() {
		Animal fly = new Butterfly();
		assertFalse(fly.sing());// can not fly as it is in EGG stage
	}

}
