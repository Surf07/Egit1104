package Lesson685;//isEqual(Object)


import java.util.function.Predicate;


public class Java8Sample {
	public static void main(String[] args) {

		Predicate<String> isHoge = Predicate.isEqual("hoge");
		System.out.println(isHoge.test("hoge"));
		System.out.println(isHoge.test("fuga"));

		Predicate<Object> isNull = Predicate.isEqual(null);
		System.out.println(isNull.test(null));
		System.out.println(isNull.test("not null"));

	}

}
/*引数で受け取ったオブジェクトと等しいかどうかを判定する新しいPredicateオブジェクトを生成する（比較はObject#equals(Object)メソッド
が使用される）。nullセーフになっている。*/
