package Lesson621;



class Parent{
	public void disp() {
		System.out.println("スーパークラスのdisp()メソッドを実行しました。");
	}
}

class Child extends Parent{
	@Override
	public void disp() {
		super.disp();
		System.out.println("サブクラスで拡張した処理を実行しました。");
	}
}

public class Sample {
	public static void main(String[] args) {
		Child c = new Child();
		c.disp();
	}
}
