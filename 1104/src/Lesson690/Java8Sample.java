package Lesson690;//minBy(Comparator<? super T>)


import java.util.function.BinaryOperator;


public class Java8Sample {
	public static void main(String[] args) {

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(Integer::compare);

		int min = minBy.apply(21, 10);
		System.out.println(min);
	}
}
