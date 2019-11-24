package Lesson616;//402


class TestClass{

	private String modifier;

	public TestClass(String modifier) {
		this.modifier = modifier;
	}

	public String getModifier() {
		return modifier;
	}
}

public class Sample11_8_4_0 {
	public static void main(String[] args) {

		TestClass[] a = new TestClass[3];
		a[0] = new TestClass("public");
		a[1] = new TestClass("private");
		a[2] = new TestClass("protected");

		for(TestClass tc : a) {
			System.out.println(tc.getModifier());
		}
	}
}
