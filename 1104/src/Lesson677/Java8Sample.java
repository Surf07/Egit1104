package Lesson677;//compose(Function<?  super V, extends T>


import java.util.function.Function;


public class Java8Sample {
	public static void main(String[] args) {

		Function<String, String> wrapDoubleQuotation = str -> "\"" + str + "\"";

		Function<String, String> wrapSingleQuotation = str -> "\"" + str + "\"";

        Function<String, String> wrapDoubleAndSingleQuotaion = wrapDoubleQuotation.compose(wrapSingleQuotation);

        String result = wrapDoubleAndSingleQuotaion.apply("hoge");

        System.out.println(result);

        /*compose()メソッドを実行したFunctionオブジェクトに引数で渡したFunctionオブジェクトを組み合わせた新しい Function
         オブジェクトが生成される*/

}
}
