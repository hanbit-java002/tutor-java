package com.hanbit.animal;

public class Hamster extends Animal {

	public static final String DEFAULT_NAME = "햄토리";
	
	public Hamster(String kind, String color) {
		this(DEFAULT_NAME, kind, color);
	}
	
	public Hamster(String name, String kind, String color) {
		super(name, kind, color);
	}

	@Override
	protected String getDefaultName() {
		return DEFAULT_NAME;
	}

}
