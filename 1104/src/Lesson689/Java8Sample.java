package Lesson689;//BinaryOperator<T>  maxBy(Comparator<? super T>)

//BiFunctionの拡張インターフェース。T型の引数を２つ受け取ってT型の値を返すapply(T,T)メソッドが対象メソッドとして存在する。


import java.util.function.BinaryOperator;


public class Java8Sample {
	public static void main(String[] args) {

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Integer::compare);

		int max = maxBy.apply(21, 10);

		System.out.println(max);
	}
}

/*apply(T,T)メソッドに渡された２値を、指定したComparatorオブジェクトで比較して大きい方の値を返すBinaryOperator
オブジェクトを生成する*/
