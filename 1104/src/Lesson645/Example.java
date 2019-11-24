package Lesson645;



public class Example {
	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Iida OK!");

		Thread t = new Thread(r);
		t.start();
	}
}


class Example1{
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Kazuya OK!");
			}
		};

		Thread t = new Thread(r);
		t.start();
	}
}

