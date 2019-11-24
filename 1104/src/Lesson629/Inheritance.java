package Lesson629;



class Parent{


	public String fieldA = "field A";

	public String methodA() {
		return"method A";
	}
}

class Child extends Parent{


	public String fieldB = "field B";


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

		Parent parent = new Child();

		System.out.println(parent.fieldA);
		System.out.println(parent.methodA());

	}

}