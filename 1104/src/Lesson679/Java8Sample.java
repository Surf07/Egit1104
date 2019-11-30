package Lesson679;//identity()


import java.util.function.Function;


public class Java8Sample {
	public static void main(String[] args) {

		Function<String,String> function = Function.identity();
		System.out.println(function.apply("string message"));
	}
}

