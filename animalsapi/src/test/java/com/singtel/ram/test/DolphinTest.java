package com.singtel.ram.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.ram.model.impl.Dolphin;
import com.singtel.ram.model.impl.Fish;

public class DolphinTest {
	
	
	@Test(expected=NullPointerException.class)
	public void testDolphinSim(){
		Dolphin dolphin=new Dolphin();
		assertFalse(dolphin.swim());
		
	}

	@Test
	public void testDolphinSwimWithFishBheavior(){
		Dolphin dolphin=new Dolphin();
		dolphin.setFishBehvior(new Fish());
		assertTrue(dolphin.swim());
		
	}
}
