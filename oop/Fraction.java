package chap03.oop;

public class Fraction {
	private int Num = 1;  //Numerator
	private int Deno = 1; // Denominator
	public int getNum() {
		return this.Num;
	}
	public void setNum(int x) {
		this.Num = x;
	}
	public int getDeno() {
		return this.Deno;
	}
	public void setDeno(int y) {
		this.Deno = y;
	}
	public void getIf() {
		System.out.println(this.Num + "/" + this.Deno);
	}
	public Fraction (int a, int b) {
		this.Num = a;
		this.Deno = b;
	}
	public Fraction(int a) {
		this.Num=a;
		this.Deno=1;
	}
	public Fraction() {
		
	}
	
	
//	tong 
	public Fraction sumF(Fraction x,Fraction y) {
		Fraction temp = new Fraction();
		temp.setNum((x.getNum()*y.getDeno()) + (y.getNum()*x.getDeno())) ;
		temp.setDeno(x.getDeno()*y.getDeno());
		temp.simplifyF();
		return temp;
	}
//	hieu
	public Fraction minusF(Fraction x,Fraction y) {
		Fraction minusFraction = new Fraction();
		minusFraction.setNum((x.getNum()*y.getDeno()) - (y.getNum()*x.getDeno())) ;
		minusFraction.setDeno(x.getDeno()*y.getDeno());
		minusFraction.simplifyF();
		return minusFraction;
	}
	
//	nhan	
	public Fraction mutiplyF(Fraction x,Fraction y) {
		Fraction mutiplyFraction = new Fraction();
		mutiplyFraction.setNum(x.getNum()*y.getNum()) ;
		mutiplyFraction.setDeno(x.getDeno()*y.getDeno());
		mutiplyFraction.simplifyF();
		return mutiplyFraction;
	}
	
//	chia
	public Fraction divisionF(Fraction x,Fraction y) {
		Fraction divisionFraction = new Fraction();
		divisionFraction.setNum(x.getNum()*y.getDeno()) ;
		divisionFraction.setDeno(x.getDeno()*y.getNum());
		divisionFraction.simplifyF();
		return divisionFraction;
	}
	public boolean equals(Fraction x,Fraction y) {
		return((x.getNum()*y.getDeno())>(y.getNum()*x.getDeno()));
	}
	
	
//	ham rut gon phan so
	public void simplifyF() {
		int x = UCLN(this.getNum(),this.getDeno());
		this.setNum(this.getNum()/x);
		this.setDeno(this.getDeno()/x) ;
	}
//	tim UCLN
	public int UCLN(int a,int b) {
		if(a<0) {
			a=-a;
		} else if(b<0) {b=-b;}
		while(a!=b) {
			if(a>b) {
				a-=b;
			} else {
				b-=a;
			}
		}
		return a;
	}
}