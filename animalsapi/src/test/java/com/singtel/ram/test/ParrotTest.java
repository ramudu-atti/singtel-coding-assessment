package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.model.Animal;
import com.singtel.ram.model.impl.Bird;
import com.singtel.ram.model.impl.Cat;
import com.singtel.ram.model.impl.Dog;
import com.singtel.ram.model.impl.Parrot;
import com.singtel.ram.model.impl.Rooster;

public class ParrotTest {

	

		@Test
		public void testCParrotCanFly() {

			Animal parrot = new Parrot();
			assertTrue(parrot.fly());

		}
		
		@Test
		public void testParrotSingLikeADuck() {
			Bird parrot = new Parrot();
			assertEquals(true, parrot.sing());

		}

		@Test
		public void testParrotCanNotSwim() {
			Bird parrot = new Parrot();
			assertFalse(parrot.swim());
		}

		@Test
		public void testParrotCanWalk() {
			Parrot parrot = new Parrot();
			assertTrue(parrot.walk());
		}

		@Test
		public void testParrotLivingWithDogCanSing() {
			Parrot parrot = new Parrot();
			parrot.setLivingWithAnimal(new Dog());
			assertEquals(true, parrot.sing());

		}
		@Test
		public void testParrotLivingWithCatCanSing() {
			Parrot parrot = new Parrot();
			parrot.setLivingWithAnimal(new Cat());
			assertEquals(true, parrot.sing());

		}
		@Test
		public void testCParrotLivingWithRoosterCanSing() {
			Parrot parrot = new Parrot();
			parrot.setLivingWithAnimal(new Rooster());
			assertEquals(true, parrot.sing());

		}
		
}
