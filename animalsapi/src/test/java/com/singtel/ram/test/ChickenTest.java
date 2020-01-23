package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.model.impl.Bird;
import com.singtel.ram.model.impl.Chicken;
import com.singtel.ram.model.impl.Rooster;

public class ChickenTest {

	@Test
	public void testChickenCanNotFlyTest() {

		Bird chicken = new Chicken();
		assertFalse(chicken.fly());

	}

	@Test
	public void testChickenCanNotSwim() {
		Bird chicken = new Chicken();
		assertFalse(chicken.swim());
	}

	@Test
	public void testChickenCanWalk() {
		Bird chicken = new Chicken();
		assertTrue(chicken.walk());
	}

	@Test
	public void testChickenCanSing() {
		Bird chicken = new Chicken();
		assertEquals(true, chicken.sing());

	}
	
	
}
