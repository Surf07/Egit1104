package Lesson637;



class Outer{
	private String message = "Outerクラスのprivateなインスタンス変数です。";

	void doSomething() {

		class Inner{
			void print() {
				System.out.println("Innerクラスのprintメソッドが呼ばれました");
				System.out.println(message);
			}
		}
	}


public class InnerClassExample {
	public void main(String[] args) {
		Outer outer = new Outer();
		outer.doSomething();
	}
}
}
