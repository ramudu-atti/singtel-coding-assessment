package com.singtel.ram;

import java.util.stream.*;

import com.singtel.ram.model.Animal;
import com.singtel.ram.model.impl.Bird;
import com.singtel.ram.model.impl.Butterfly;
import com.singtel.ram.model.impl.Cat;
import com.singtel.ram.model.impl.Chicken;
import com.singtel.ram.model.impl.ClownFish;
import com.singtel.ram.model.impl.Dog;
import com.singtel.ram.model.impl.Dolphin;
import com.singtel.ram.model.impl.Duck;
import com.singtel.ram.model.impl.Fish;
import com.singtel.ram.model.impl.Parrot;
import com.singtel.ram.model.impl.Rooster;
import com.singtel.ram.model.impl.Shark;

public class AnimalsCount {

	public static void main(String[] args) {

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Dog(), new Butterfly(), new Cat() };

		int flyable = Stream.of(animals).filter(x -> x.fly()).collect(Collectors.counting()).intValue();

		int walkable = Stream.of(animals).filter(x -> x.walk()).collect(Collectors.counting()).intValue();
		int swimmable = Stream.of(animals).filter(x -> x.swim()).collect(Collectors.counting()).intValue();

		int singingCount = Stream.of(animals).filter(x -> x.sing()).collect(Collectors.counting()).intValue();

		System.out.println("Singing:" + singingCount);
		System.out.println("flyable:" + flyable);
		System.out.println("walking count:" + walkable);
		System.out.println("swimming count:"+swimmable);

	}

}
