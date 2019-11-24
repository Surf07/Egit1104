package Lesson631;



class Parent{


	String fieldA = "field A";

	public String methodA() {
		return"method A";
	}
}

class Child extends Parent{


	String fieldA = "field A in Child";

    String fieldB = "field B";

	@Override
	public String methodA() {
		return "method A in Child";
	}

	public String methodB() {
		return "method B";
	}
}


public class Inheritance {
	public static void main(String[] args) {

		Child child = new Child();
		Parent parent = child;

		System.out.println(parent.fieldA);
		System.out.println(child.fieldA);

		System.out.println(((Parent)child).fieldA); //Child型の変数で隠蔽されているParentのフィールドを参照するにはキャストすることも可。

		System.out.println(parent.methodA());
		System.out.println(child.methodA());

	}

}