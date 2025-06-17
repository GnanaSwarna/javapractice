package xyz;

  abstract class Abstractexample {
	abstract void Atm();
	public void atm2() {
		System.out.println("without abstract atm");
	}
}
 class B extends Abstractexample {
	void Atm() {
		System.out.println("with abstract atm");
	}
}

 class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractexample  b=new B();
		b.Atm();
		b.atm2();
	}
}
