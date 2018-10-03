package chap01.basic;

import java.util.Scanner;

public class p06_caculator {
	public static void main(String[] args) {
		int numberFirst;
		int numberSecond ;
		String caculate;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number First: ");
		numberFirst = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Number Second: ");
		numberSecond = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Caculate: ");
		caculate = sc.nextLine();
		sc.close();
		
		int result = 0;
		
		switch(caculate) {
		case "+":
			result = numberFirst + numberSecond;
			break;
		case "-":
			result = numberFirst - numberSecond;
			break;
		case "*":
		case "x":
			result = numberFirst * numberSecond;
			break;
		case ":":
		case "/":
			result = numberFirst / numberSecond;
			break;
		case "%":
			result = numberFirst % numberSecond;
			break;
		default:
			break;
		}
		System.out.println("-----------------");
		System.out.printf("%d %s %d = %d", numberFirst , caculate, numberSecond,result);
	}
}
