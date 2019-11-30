package Lesson676;// Function<T, R>   apply(T)



import java.util.function.Function;



public class Java8Sample {
	public static void main(String[] args) {

		Function<String, Integer> function = string -> Integer.parseInt(string);
		
		//Function<T, R>の抽象メソッド。T型の引数を受け取って、R型の値を返す処理をする。

		System.out.println(function.apply("12345"));
	}

}
