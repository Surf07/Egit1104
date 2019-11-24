package Lesson642;//420


interface IF_A{
	int num = 5000;
	void a();
}

interface IF_B{
	void b();
}

interface IF_C extends IF_A, IF_B{
	void c();
}

class ImplementsC implements IF_C{
	@Override
	public void a() {
		System.out.println(num);
	}
	@Override
	public void b() {
		System.out.println("b()メソッドでnumの値を表示します:" + num);
	}
	@Override
	public void c() {
		System.out.println("c()メソッドでnumの値を表示します:" + num);
	}
}

public class Sample12_3_6_0 {
	public static void main(String[] args) {
		ImplementsC ic = new ImplementsC();
		ic.a();
		ic.b();
		ic.c();
	}
}
