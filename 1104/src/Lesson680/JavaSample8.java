package Lesson680;//UnaryOperator<T>

import java.util.function.UnaryOperator;

public class JavaSample8 {
	public static void main(String[] args) {

		UnaryOperator<String> unary = string -> "[" + string + "]";
		System.out.println(unary.apply("hoge"));
	}
}

/* Functionの拡張インターフェース。Functionの型引数が２つとも同じ型、つまり、引数も戻り値も同じ型を返す特別パターンのFunction*/
