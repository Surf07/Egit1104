package Lesson633;



class Parent{
	// インスタンス初期化ブロックはnew実行時に自動的に実行され、オーバーライド出来ない。
	//　各クラスのコンストラクタの実行前に呼び出されることがわかります。親クラスの初期化ブロックは自動的に呼び出されるため、
	//　子クラスでオーバーライド出来ない。

	{
		System.out.println("Parent instance initilizer block");
	}

	public Parent() {

		System.out.println("Parent no args constructor");
	}
}

class Child extends Parent {

	{
		System.out.println("Child instance initilizer block");
	}

	public Child() {
		System.out.println("Child no args constructor");
	}
}


public class Inheritance {
	public static void main(String[] args) {

		Parent parent = new Parent();

		System.out.println();

		Child child = new Child();
	}
}

