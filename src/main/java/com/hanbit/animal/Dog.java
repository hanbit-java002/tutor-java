package com.hanbit.animal;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class Dog {
	
	public static final String DEFAULT_NAME = "멍멍이";

	private String name;
	private final String kind;
	private String color;
	
	private boolean sit;
	
	public Dog(String kind, String color) {
		this(DEFAULT_NAME, kind, color);
	}
	
	public Dog(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return name + ":" + kind + ":" + color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (StringUtils.isBlank(name)) {
			name = DEFAULT_NAME;
		}
		
		this.name = name;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setColor(String color) {
		if (StringUtils.isBlank(color)) {
			return;
		}
		
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public void sitDown() {
		sit = true;
	}
	
	public void standUp() {
		sit = false;
	}
	
	public void draw() {
		String fileName = "";
		
		if (sit) {
			fileName = "dog_sitdown.txt";
		}
		else {
			fileName = "dog_standup.txt";
		}
		
		try {
			File dogFile = new File(getClass().getResource("/com/hanbit/animal/" + fileName).toURI());
			String dog = FileUtils.readFileToString(dogFile);
			
			System.out.println(dog);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
