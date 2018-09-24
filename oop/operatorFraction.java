package chap03.oop;

public class operatorFraction {
	public static void main(String[] args) {
		Fraction d = new Fraction();
		Fraction x = new Fraction(4,8);
		Fraction y = new Fraction(6,9);
		d.sumF(x, y).getIf();
		d.minusF(x, y).getIf();
		d.mutiplyF(x, y).getIf();
		d.divisionF(x, y).getIf();
	}
}
