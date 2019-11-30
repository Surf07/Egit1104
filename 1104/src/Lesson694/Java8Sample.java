package Lesson694;//Obj〜Consumer

//ObjIntConsumer<T>
//ObjLongConsumer<T>
//ObjDoubleConsumer<T>

/*それぞれT型の値と〜の値を引数に受け取るaccept(T,〜)メソッドを抽象メソッドとして持つ*/

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjIntConsumer;

public class Java8Sample {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("hoge", "fuga", "piyo");

		forEach(list,(value, index) -> {

			System.out.printf("list[%d] = %s%n", index, value);
		});
	}

	public static <T> void forEach(List<T> list, ObjIntConsumer<T> callback) {
		for(int i=0; i<list.size(); i++) {
			callback.accept(list.get(i), i);
		}
	}
}
