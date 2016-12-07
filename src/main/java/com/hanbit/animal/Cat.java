package com.hanbit.animal;

public class Cat extends Animal {
	
	public static final String DEFAULT_NAME = "야옹이";
	
	public Cat(String kind, String color) {
		this(DEFAULT_NAME, kind, color);
	}
	
	public Cat(String name, String kind, String color) {
		super(name, kind, color);
	}

	@Override
	protected String getDefaultName() {
		return DEFAULT_NAME;
	}

	public void climbTree() {
		System.out.println("나무에 올라감");
	}
}
