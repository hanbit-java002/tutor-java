package com.hanbit.java;

public class Loop {

	public static void main(String[] args) {
		
		/*
		 * countDown 함수를 만들어서
		 * 입력받은 숫자부터 0까지 출력하시오.
		 */
		countDown7(10);
	}
	
	/**
	 * for-each 사용 x 2
	 * 
	 * @param input
	 */
	static void countDown7(int input) {
		int[] numbers = new int[input + 1];
		
		int init = input;
		
		for (int num : numbers) {
			numbers[init - input] = input--;
		}
		
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	
	/**
	 * for-each 사용
	 * 
	 * @param input
	 */
	static void countDown6(int input) {
		int[] numbers = new int[input + 1];
		
		for (int num : numbers) {
			System.out.println(input--);
		}
	}
	
	/**
	 * 재귀함수(Recursive Function) 사용
	 * 
	 * @param input
	 */
	static void countDown5(int input) {
		if (input < 0) {
			return;
		}
		
		System.out.println(input);
		
		countDown5(--input);
	}
	
	/**
	 * while 사용 (break)
	 * 
	 * @param input
	 */
	static void countDown4(int input) {
		
		while (true) {
			System.out.println(input--);
			
			if (input < 0) {
				break;
			}
		}
	}
	
	/**
	 * while 사용
	 * 
	 * @param input
	 */
	static void countDown3(int input) {
		
		while (input >= 0) {
			System.out.println(input--);
		}
	}
	
	/**
	 * for 사용 (역순)
	 * 
	 * @param input
	 */
	static void countDown2(int input) {
		
		for (int i=input;i>=0;i--) {
			System.out.println(i);
		}
	}
	
	/**
	 * for 사용
	 * 
	 * @param input
	 */
	static void countDown(int input) {
		
		for (int i=0;i<=input;i++) {
			System.out.println(input - i);
		}
	}
	
}
