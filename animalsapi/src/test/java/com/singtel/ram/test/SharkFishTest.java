package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.model.impl.ClownFish;
import com.singtel.ram.model.impl.Fish;
import com.singtel.ram.model.impl.Shark;

public class SharkFishTest {

	
	@Test
	public void testClownFishSize() {

		Fish fish = new Shark();

		assertEquals("large", fish.getSize());
	}

	@Test
	public void testClownFishColor() {

		Fish fish = new Shark();

		assertEquals("grey", fish.getColor());
	}

	@Test
	public void testSharkFishSing() {

		Fish fish = new Shark();
		assertFalse(fish.sing());
	}

	@Test
	public void testSharkFishFly() {
		Fish fish = new Shark();
		assertFalse(fish.fly());
	}

	@Test
	public void testSharkFishSwim() {
		Fish fish = new Shark();
		assertTrue(fish.swim());
	}

	@Test
	public void testSharkFishWalk() {
		Fish fish = new Shark();
		assertFalse(fish.walk());
	}

	
	@Test
	public void testSharkCanEatFih() {
		Shark fish = new Shark();
		assertTrue(fish.canEatOtherFish());
	}
}
