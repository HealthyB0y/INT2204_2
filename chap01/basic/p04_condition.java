package chap01.basic;

public class p04_condition {
	public static void main(String[] args) {
		int Number = 15;
		int tmp = Number % 2;
		
		if(tmp == 0) {
			System.out.println("số chẵn");
		} else {
			System.out.println("số lẻ");
		}
		switch (Number) {
		case 1:
			System.out.println("thứ Nhất");
			break;
		case 15:
			System.out.println("thứ Hai");
			break;
		default:
			System.out.println("thứ Ba");
			break;
		}
	}
	
}
