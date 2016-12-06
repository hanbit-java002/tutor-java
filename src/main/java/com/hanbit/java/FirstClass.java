package com.hanbit.java;

public class FirstClass {

	int number;
	int sum;
	
	FirstClass(int number) {
		this.number = number;
	}
	
	int getNumber() {
		return number;
	}
	
	int addNumber(int add) {
		number += add;
		
		int sum = number;
		this.sum = sum;
		
		return number;
	}
	
}
