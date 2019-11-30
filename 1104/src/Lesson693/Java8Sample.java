package Lesson693;//〜To***Function

import java.util.function.IntToDoubleFunction;

//IntToDoubleFunction
//DoubleToIntFunction
//LongToDoubleFunction
//DoubleToLongFunction
//IntToLOngFunction
//LongToIntFunction

/*それぞれ〜を受け取って***を返すapplyAs***（〜）メソッドを抽象メソッドとして持つ。*/


public class Java8Sample {
	public static void main(String[] args) {

		IntToDoubleFunction function = i -> (double)i;

		System.out.println(function.applyAsDouble(20));
	}

}
