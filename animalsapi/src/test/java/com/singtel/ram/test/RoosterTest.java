package com.singtel.ram.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.ram.model.impl.Chicken;
import com.singtel.ram.model.impl.Rooster;
import com.singtel.ram.model.impl.RoosterDelagator;

public class RoosterTest {

	
	@Test
	public void testRoosterSing() {
		Chicken rooster = new Rooster();
		assertEquals(true, rooster.sing());

	}
	
	@Test
	public void testRoosterCanNotFly() {
		Rooster rooster = new Rooster();
		assertEquals(false, rooster.fly());

	}
	
	@Test
	public void testRoosterDelagationSing() {
		RoosterDelagator roosterDelegator = new RoosterDelagator();
		assertEquals(false, roosterDelegator.swim());

	}
	
	
	
}
