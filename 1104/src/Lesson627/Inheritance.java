package Lesson627;



class Parent{


	public String fieldA = "field A";

	public String methodA() {
		return"method A";
	}
}

class Child extends Parent{


	public String fieldB = "field B";

	public String methodB() {
		return "method B";
	}
}

public class Inheritance {
	public static void main(String[] args) {

		Child child = new Child();

		System.out.println(child.fieldA);
		System.out.println(child.fieldB);
		System.out.println(child.methodA());
		System.out.println(child.methodB());
	}

}
