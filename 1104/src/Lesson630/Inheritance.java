package Lesson630;



interface Parent{
	String methodA();
}

class Child implements Parent{
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
		System.out.println(parent.methodA());
	}
}
