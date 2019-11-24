package Lesson619;



class A{
	int num;

	public A(int num) {
		this.num = num;
		System.out.println(num);
	}
}

class B extends A {
	public B(int x) {
		super(x);
	}
}

public class Sample11_9_5_2 {
	public static void main(String args[]) {
		B sample = new B(100);
	}

}
