package chap01.basic;

import java.util.Scanner;

public class p08_shape {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	

	public static void main2(String[] args) {
		int n=5;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		sc.nextLine();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
//		sc.close();
	}
}
