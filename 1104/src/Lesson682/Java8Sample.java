package Lesson682; //andThen(Consumer<? super T>)


import java.util.function.Consumer;

public class Java8Sample {
	public static void main(String[] args) {


		Consumer<String> hoge = string -> System.out.println("hoge :" + string);

		Consumer<String> fuga = string -> System.out.println("fuga :" + string);

		Consumer<String> piyo = hoge.andThen(fuga);

		piyo.accept("piyo");
	}
}

/*andThen()メソッドを実行したConsumerオブジェクト ⏩ 引数で渡したConsumerオブジェクトの順序で処理を実行する新しいConsumer
 オブジェクトが生成される*/
