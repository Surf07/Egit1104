package Lesson681;//Consumer<T> accept(T)


import java.util.function.Consumer;


public class Java8Sample {
	public static void main(String[] args) {

		Consumer<String> consumer = string -> System.out.println("Consumer :" + string);

		consumer.accept("hoge");
	}
}

/* Consuker<T>の抽象メソッド。T型の値を引数に取って、戻り値無しの処理を実装する。戻り値を返さず引数を消費するだけ*/
