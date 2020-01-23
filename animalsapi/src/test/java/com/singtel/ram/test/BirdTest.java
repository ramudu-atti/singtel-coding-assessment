package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.singtel.ram.model.Animal;
import com.singtel.ram.model.impl.Bird;
import com.singtel.ram.model.impl.Chicken;
import com.singtel.ram.model.impl.Duck;

@SpringBootTest
@SpringBootConfiguration
public class BirdTest {

	@Test
	public void testBirdSing() {

		Animal bird = new Bird();

		assertEquals(true, bird.sing());
	}

	@Test
	public void testBirdWalk() {

		Animal bird = new Bird();

		assertEquals(true, bird.walk());
	}

	@Test
	public void testBirdFly() {

		Animal bird = new Bird();

		assertEquals(true, bird.fly());
	}

	@Test
	public void testBirdSwim() {

		Animal bird = new Bird();

		assertEquals(false, bird.swim());
	}
	@Test
	public void testDuckSwim() {
		Bird duck = new Duck();
		assertTrue(duck.swim());
		
	}
	
	@Test
	public void testChickenCannotFly() {
		Bird chicken = new Chicken();
		assertFalse(chicken.fly());
	}

}
