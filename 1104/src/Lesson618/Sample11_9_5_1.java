package Lesson618;



class A {

	public A() {
		System.out.println("Aクラスのパラメーターなしコンストラクターを実行しまいた。");
	}

	public A(int num) {
		System.out.println("Aクラスのパラメーター付コンストラクターを実行しました。");
	}
}

class B extends A {

	public B() {
		super(10);
		System.out.println("Bクラスのコンストラクターを実行しました。");
	}
}

public class Sample11_9_5_1 {
	public static void main(String arg[]) {
		B sample = new B();
	}
}
