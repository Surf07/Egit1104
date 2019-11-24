package Lesson617;//404


class A {
	A(){
		super();
		System.out.println("クラスAのコンストラクターです。");
	}
}

class B extends A {
	B(){

		System.out.println("クラスBのコンストラクターです。");
	}
}

class C extends B {
	C(){
		System.out.println("クラスCのコンストラクターです。");
	}
}

public class Sample11_9_5_0 {
	public static void main(String args[]) {
		 C obj = new C();
	}
}
