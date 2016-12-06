package com.hanbit.java;

import com.hanbit.animal.Cat;
import com.hanbit.animal.Dog;

public class Runner {
	
	public static void main(String[] args) {
		Dog dog = new Dog("도베르만", "검정");
		Cat cat = new Cat("길고양이", "줄무늬");
		
		dog.setName("");
		cat.setName(null);
		
		System.out.println(dog);
		System.out.println(cat);
	}
	
}
