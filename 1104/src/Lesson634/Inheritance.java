package Lesson634;


class Parent{
	// static初期化ブロック
	static{
		System.out.println("Parent static initilizer block");
	}

	public Parent() {
		System.out.println("Parent no args constructor");
	}
}

class Child extends Parent {
	// static初期化ブロック                                                                                                                                                                                                                                                                                     // static初期化ブロック
	static {
		System.out.println("Child instance initilizer block");
	}

	public Child() {
		System.out.println("Child no args constructor");
	}
}


public class Inheritance {
	public static void main(String[] args) {

		Parent parent = new Parent();
		Parent parent2 = new Parent();

		System.out.println();

		Child child = new Child();

		Child child2 = new Child();
	}
}

