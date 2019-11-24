package Lesson625;



class superClass{
	public void disp() {
		System.out.println("製品名は登録されていません");
	}
}

class subClassA extends superClass{
	@Override
	public void disp() {
		System.out.println("商品名はPRODUCTです");
	}
}

class subClassB extends superClass{
	@Override
	public void disp() {
		System.out.println("商品名はMANUFACTUREです");
	}
}

public class Sample {
	public static void main(String args[]) {
		superClass obj = new superClass();
		obj = new subClassA();

		obj.disp();
		obj = new subClassB();
		obj.disp();
	}
}
