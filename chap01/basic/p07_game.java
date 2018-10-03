package chap01.basic;

import java.util.Scanner;

public class p07_game {
	public static void main(String[] args) {
		
		final int maxNumber = 100;
		final int minNumber = 1;
		int range = (maxNumber - minNumber) + 1;
		int score = 0;
		double secretNumber = 0;
		secretNumber = (int)(Math.random() * range) + minNumber;
		
		
		Scanner sc = new Scanner(System.in);
		
		int yourNumber = 0;
		while(true) {
			System.out.println("Your's Number (1-100)");
			yourNumber = sc.nextInt();
			sc.nextLine();
			if(yourNumber > secretNumber) {
				System.out.println("Greater than!");
			} else if(yourNumber < secretNumber) {
				System.out.println("Less than!");
			} else {
				System.out.println("Successfull!");
				break;
			}
			score++;
		}
		System.out.println("score : " + score);
		sc.close();
	}
}
