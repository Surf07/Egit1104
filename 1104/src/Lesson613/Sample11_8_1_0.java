package Lesson613;


class TestClass{

	private int num;

	public TestClass(int num) {
		this.num = num;
	}



	public void show(TestClass a) {

		int value = a.num;
		System.out.println(
				"呼び出し元のインスタンスフィールド値は" + num);
		System.out.println(
				"引数で渡されたインスタンスフィールド値は" + value);
	}
}

public class Sample11_8_1_0 {
	public static void main(String[] args) {
		//main()の最初の処理としてTestClassのインスタンスを２個生成し、インスタンスへの参照をobj1とobj2にそれぞれ代入。この後
		//参照変数obj1を使ってTestClassのshow()メソッドを呼び出します。このとき引数に参照変数のobj2を指定しているのがポイント。

		TestClass obj1 = new TestClass(100);
		TestClass obj2 = new TestClass(500);

		obj1.show(obj2);
		//obj2は参照変数、obj2が指し示すインスタンスの参照がshow()メソッドに渡されます。

		obj1.show(obj1);

		obj2.show(obj2);

		obj2.show(obj1);


	}
}
