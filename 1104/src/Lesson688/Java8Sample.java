package Lesson688;//negate()


import java.util.function.Predicate;


public class Java8Sample {
	public static void main(String[] args) {

		Predicate<String> isEmpty = string -> string.isEmpty();

		Predicate<String> isNotEmpty = isEmpty.negate();

		System.out.println(isNotEmpty.test("hoge"));
		System.out.println(isNotEmpty.test(""));
	}
}

/*negate()を実行したPredicateオブジェクトを否定する、新しいPredicateオブジェクトが生成される。*/
