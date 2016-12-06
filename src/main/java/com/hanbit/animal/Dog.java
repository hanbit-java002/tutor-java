package com.hanbit.animal;

public class Dog extends Animal {
	
	public static final String DEFAULT_NAME = "멍멍이";

	public Dog(String kind, String color) {
		this(DEFAULT_NAME, kind, color);
	}
	
	public Dog(String name, String kind, String color) {
		super(name, kind, color);
	}

	@Override
	protected String getDefaultName() {
		return DEFAULT_NAME;
	}
	
}
