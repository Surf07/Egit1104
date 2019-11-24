package Lesson622;



class A{
	public void show() {
		System.out.println("Aクラスのshow()メソッドです。");
	}
}

class B extends A{
	@Override
	public void show() {
		System.out.println("Bクラスのshow()メソッドです。");
		super.show();
	}
}

class C extends B{
	@Override
	public void show() {
		System.out.println("Cクラスのshow()メソッドです。");
	}
}

public class Sample12_1_3_0 {
	public static void main(String args[]) {
		C c = new C();
		c.show();
	}
}
