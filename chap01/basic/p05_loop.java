package chap01.basic;

public class p05_loop {
	public static void main(String[] name) {
		for(int i=2;i<=9;i++) {
			
			System.out.println("Bảng cửu chương " + i);
			
			for(int j=1;j<=10;j++) {
				System.out.printf("%d x %d = %d %n" , i , j , i*j );
			}
		}
	}
}
