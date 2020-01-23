package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.model.impl.Dolphin;
import com.singtel.ram.model.impl.Fish;

public class DolphinTest {
	
	
	@Test
	public void testDolphinFly(){
		Dolphin dolphin=new Dolphin();
		assertFalse(dolphin.fly());
		
	}

	@Test
	public void testDolphinSwimWithFishBheavior(){
		Dolphin dolphin=new Dolphin();
		dolphin.setFishBehvior(new Fish());
		assertTrue(dolphin.swim());
		
	}
}
