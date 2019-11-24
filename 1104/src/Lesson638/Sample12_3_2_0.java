package Lesson638;//416



abstract class superClass{
	abstract public void disp();
}

class subClassA extends superClass{
	@Override
	public void disp() {
		System.out.println("商品名はPRODUCTです。");
	}
}

class subClassB extends superClass{
	@Override
	public void disp() {
		System.out.println("商品名はMANUFACTUREです。");
	}
}

class subClassC extends superClass{
	@Override
	public void disp() {
		System.out.println("商品名はGOODSです。");
	}
}

public class Sample12_3_2_0 {
	public static void main(String args[]) {

		superClass obj = new subClassA();
		obj.disp();

		obj = new subClassB();
		obj.disp();

		obj = new subClassC();
		obj.disp();

	}
}
