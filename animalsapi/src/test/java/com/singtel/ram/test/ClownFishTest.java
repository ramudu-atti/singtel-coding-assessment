package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.model.impl.Fish;
import com.singtel.ram.model.impl.ClownFish;

public class ClownFishTest {

	@Test
	public void testClownFishSize() {

		Fish fish = new ClownFish();

		assertEquals("small", fish.getSize());
	}

	@Test
	public void testClownFishColor() {

		Fish fish = new ClownFish();

		assertEquals("orange", fish.getColor());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testClownFishInvalidSizeAndColor() {

		Fish fish = new ClownFish("large", "orangeee");
		assertEquals("grey", fish.getColor());
	}

	@Test
	public void testClownFishFishSing() {

		Fish fish = new ClownFish();
		assertFalse(fish.sing());
	}

	@Test
	public void testClownFishFishFly() {
		Fish fish = new ClownFish();
		assertFalse(fish.fly());
	}

	@Test
	public void testClownFishFishSwim() {
		Fish fish = new ClownFish();
		assertTrue(fish.swim());
	}

	@Test
	public void testClownFishFishWalk() {
		Fish fish = new ClownFish();
		assertFalse(fish.walk());
	}

	@Test
	public void testClownFishCanMakeJOKES() {
		ClownFish fish = new ClownFish();
		assertTrue(fish.canMakeJokes());

	}

	@Test
	public void testClownFishCanEatOtherFish() {
		ClownFish fish = new ClownFish();
		assertFalse(fish.canEatOtherFish());

	}

}
