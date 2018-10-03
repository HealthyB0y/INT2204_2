package chap01.basic;

import javafx.scene.control.Cell;

public class p03_operator {
	public static void main(String[] args) {
		int NumberOne = 10;
		double NumberTwo = 11.25;
		int NumberThree = 19;
		
		double result = Math.max(NumberOne,NumberTwo);
		result = Math.max(result, NumberThree);
		System.out.println(result);
		System.out.println(Math.ceil(NumberTwo));
		System.out.println(Math.floor(NumberTwo));
		System.out.println(Math.round(NumberTwo));
		int max = 19;
		int min = 14;
		int range = (max - min)+1;
		double NumberRandoom =(int)(Math.random()*range) + min;
		System.out.println(NumberRandoom);
	}
	
	
	
	public static void main01(String[] args) {
		int Number = 10;
		System.out.println(Number);
		System.out.println(++Number);
		System.out.println(Number++);
		
		
		int NumberEnd=10;
		System.out.println(--NumberEnd);
		System.out.println(NumberEnd--);
		
	}
}
