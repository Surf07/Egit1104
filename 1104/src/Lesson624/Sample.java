package Lesson624;



class superClass{
	public void disp() {
		System.out.println("製品名は登録されていません");
	}
}

class subClassA extends superClass{
	@Override
	public void disp() {
		System.out.println("製品名はPRODUCTです");
	}
}

class subClassB extends superClass{
	@Override
	public void disp() {
		System.out.println("製品名はMANUFACTUREです");
	}
}

public class Sample {
	public static void main(String[] args) {
		subClassA obj1 = new subClassA();
		subClassB obj2 = new subClassB();

		obj1.disp();
		obj2.disp();
	}
}
