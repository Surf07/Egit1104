package Lesson678;//andThen(Function<?  super R,?  extends V>)


import java.util.function.Function;


public class Java8Sample {
	public static void main(String[] args) {

		Function<String, String> wrapDoubleQuotation = str ->"\"" + str + "\"";

		Function<String, String> wrapSingleQuotation = str ->"\"" + str + "\"";

		Function<String, String> wrapDoubleAndSingleQuotation = wrapDoubleQuotation.andThen(wrapSingleQuotation);

		String result = wrapDoubleAndSingleQuotation.apply("hoge");

		System.out.println(result);
	}

}
