package Lesson686;//and(Predicate<? super T>)


import java.util.function.Predicate;


public class Java8Sample {
	public static void main(String[] args) {

		Predicate<String> isUpperCase = string -> string.matches("[A-Z]+");

		Predicate<String> isAlphabet = string -> string.matches("[a-zA-Z]+");

		Predicate<String> predicate = isAlphabet.and(isUpperCase);

		System.out.println(predicate.test("HOGE"));
		System.out.println(predicate.test("hoge"));

	}
}

/*引数で渡したPredicateオブジェクトをAND条件で連結させた新しいPredicateオブジェクトを生成する*/
