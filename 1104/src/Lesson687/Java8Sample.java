package Lesson687;//or(Predicate<? super T>


import java.util.function.Predicate;


public class Java8Sample {
	public static void main(String[] args) {

		Predicate<String> isUpperCase = string -> string.matches("[A-Z]+");

		Predicate<String> isNumber = string -> string.matches("\\d+");

		Predicate<String> predicate = isNumber.or(isUpperCase);

		System.out.println(predicate.test("HOGE"));
		System.out.println(predicate.test("1234"));
		System.out.println(predicate.test("hoge"));

	}
}
/*引数で渡したPredicateオブジェクトをOR条件で連結させた新しいPredicateオブジェクトを生成する*/