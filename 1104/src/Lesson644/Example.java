package Lesson644;


public class Example{
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Kazuya Iida OK!");
			}
		};

		Thread t = new Thread(r);
		t.start();
	}
}

