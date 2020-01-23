package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.model.Animal;
import com.singtel.ram.model.impl.Bird;
import com.singtel.ram.model.impl.Duck;

public class DuckTest {

	@Test
	public void testDuckCanFlyTest() {

		Bird Duck = new Duck();
		assertTrue(Duck.fly());

	}

	@Test
	public void testDuckSwim() {
		Animal Duck = new Duck();
		assertTrue(Duck.swim());
	}

	@Test
	public void testDuckCanWalk() {
		Bird Duck = new Duck();
		assertTrue(Duck.walk());
	}

	@Test
	public void testDuckCanSing() {
		Bird Duck = new Duck();
		assertEquals(true, Duck.sing());

	}
}
