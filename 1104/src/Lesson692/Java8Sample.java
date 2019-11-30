package Lesson692;

//ToIntBiFunction<T,U>
//ToLongBiFunction<T,U>
//ToDoubleBiFunction<T,U>

/*それぞれ、To〜Functionの引数が２つになったバージョン*/

import java.util.function.ToIntBiFunction;

public class Java8Sample {
	public static void main(String[] args) {

		ToIntBiFunction<Integer,Integer> add = (a,b) -> a + b;

		System.out.println(add.applyAsInt(12, 53));
	}
}
