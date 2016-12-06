package com.hanbit.java;

import com.hanbit.animal.Dog;

public class Runner {
	
	public static void main(String[] args) {
		Dog dog = new Dog("도베르만", "검정");
		
		dog.sitDown();
		dog.draw();
		dog.standUp();
	}
	
}
