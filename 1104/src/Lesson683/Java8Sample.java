package Lesson683;//Supplier<T>  get()



import java.util.function.Supplier;


public class Java8Sample {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> "hoge";

		System.out.println(supplier.get());
	}
}

/* Supplier<T>の抽象メソッド。T型の値を返す処理を実装する。*/
