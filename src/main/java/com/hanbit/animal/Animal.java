package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

import com.hanbit.Breathable;
import com.hanbit.Creature;
import com.hanbit.Livable;

public abstract class Animal implements Breathable, Livable {
	
	protected String name;
	protected final String kind;
	protected String color;
	
	public Animal(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	@Override
	public boolean isLive() {
		return true;
	}
	
	@Override
	public void breathe() {
		System.out.println("산소 -> 이산화탄소");
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
			name = getDefaultName();
		}
		
		this.name = name;
	}
	
	protected abstract String getDefaultName();
	
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
	
}
