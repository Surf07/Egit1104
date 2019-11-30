package Lesson691;//To~Function と To~BiFunction

//ToIntFunction<T>
//ToLongFunction<T>
//ToDoubleFunction<T>
/*それぞれ、T型の値を引数に受け取って、プリミティブ型の値を返すapplyAs〜(T)抽象メソッドをもつ*/

import java.util.function.ToIntFunction;


public class Java8Sample {
	public static void main(String[] args) {

		ToIntFunction<String> getLength = string -> string.length();

		System.out.println(getLength.applyAsInt("hoge"));
	}
}
