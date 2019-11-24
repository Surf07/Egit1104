package Lesson654;//433  SubClassで呼ぶときのm1()とm2()の違いが分からん




class SuperClass{
	public SuperClass() {
		System.out.println("Super-con");
	}

	public SuperClass(String str) {
		System.out.println("Super-con2");
	}

	public void m1() {
		System.out.println("super-m1");
	}

	public void m2() {
		System.out.print("super-m2");
	}
}

class SubClass extends SuperClass{
	public SubClass() {
		System.out.println("SubClass-con");
	}

	public SubClass(String str) {
		super(str);
		System.out.println("SubClass-con2");
	}

public void m2() {

	System.out.println("sub-m2");
}
}

public class ExtendsTest {
	public static void main(String[]args) {

		SubClass sc1 = new SubClass();
		sc1.m1();
		sc1.m2();
		System.out.println();

		SubClass sc2 = new SubClass("hoge");
		sc2.m1();
		sc2.m2();
	}
}
