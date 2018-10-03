package chap02.oop;

public class differences {
	public static void main(String[] args) {
		String a = new String("abc");
		String b = new String("abc");
		System.out.println("a == b : " + (a==b));
		System.out.println("a.equals(b) :" + (a.equals(b)));
	}
}
//https://mobilesprogramming.wordpress.com/2010/01/26/phan-bi%E1%BB%87t-toan-t%E1%BB%AD-va-ph%C6%B0%C6%A1ng-th%E1%BB%A9c-equal-trong-java/