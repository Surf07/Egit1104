package Lesson614;//400



class TestClass{

	private int num;

	public TestClass(int num) {
		this.num = num;
	}

    public int getNum() {
    	return num;
    }

    public TestClass clone() {
    	TestClass c1 = new TestClass(num); //生成したインスタンスのコピーが出来上がり。
    	return c1; //生成したインスタンスの参照を返します。
    }
}


public class Sample11_8_3_0 {
	public static void main(String[] args) {
		TestClass obj1 = new TestClass(300); //引数に「300」を指定してTestClassのインスタンスを生成します。
		TestClass obj2 = obj1.clone();
		//生成したインスタンスのclone()メソッドを実行します。clone()メソッドの戻り値は新たに生成されたインスタンスの参照なので
		//TestClass型の変数を宣言して戻り値を受け取る。ここでは変数の宣言だけを行っており、戻り値はすでに生成済みのインスタンス
		//の参照であるのでnewは必要ない。

		System.out.println(
				"インスタンスのクローンのフィールド値は"  +  obj2.getNum());

	}
}
