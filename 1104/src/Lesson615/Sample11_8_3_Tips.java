package Lesson615;



class TestClass{

	private int num;

	public TestClass(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}

	public TestClass add(TestClass val) {
		return new TestClass( num + val.num);
		//引数に現在実行中のインスタンスobjのフィールドnumとパラメーターvalで受けたobj2のフィールドnumの
		//合計値を引数にして新たなインスタンスを生成し、生成したインスタンスの参照を返します。
	}
}

public class Sample11_8_3_Tips {
	public static void main(String[] args) {

		TestClass obj1 = new TestClass(150);
		TestClass obj2 = new TestClass(300);
		TestClass obj3 = obj1.add(obj2);

		System.out.println(
				"obj1とobj2の合計値は" + obj3.getNum());
	}
}
