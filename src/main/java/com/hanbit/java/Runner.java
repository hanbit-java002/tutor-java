package com.hanbit.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hanbit.Breathable;
import com.hanbit.Livable;
import com.hanbit.animal.Cat;
import com.hanbit.animal.Dog;
import com.hanbit.animal.Hamster;

public class Runner {
	
	public static void main(String[] args) {
		Livable dog = new Dog("도베르만", "검정");
		Livable cat = new Cat("길고양이", "줄무늬");
		Livable hamster = new Hamster("모름", "줄무늬");
		
		List list = new ArrayList();
		Map map = new HashMap();
		
		useType(dog);
		useType(cat);
		useType(hamster);
	}
	
	private static void useType(Livable livable) {
		if (livable instanceof Cat) {
			Cat cat = (Cat) livable;
			cat.climbTree();
		}
		else if (livable instanceof Breathable) {
			Breathable breathable = (Breathable) livable;
			breathable.breathe();
		}
	}
	
}
