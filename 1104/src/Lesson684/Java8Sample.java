package Lesson684;//Predicate<T>  test(T)


import java.util.function.Predicate;

public class Java8Sample {
	public static void main(String[] args) {


		Predicate<String> predicate = string -> string.isEmpty();

		System.out.println(predicate.test(""));
		System.out.println(predicate.test("hoge"));

	}

}

// T型の値を引数に受け取って、booleanの値を返す処理を実装する。
