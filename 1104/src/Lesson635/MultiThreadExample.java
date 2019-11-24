package Lesson635;



class Bank{

	static int money = 0;
	static synchronized void addOneYen() {
		money++;
	}
}

class Customer extends Thread{

	public void run() {
		for(int i = 0; i<10000; i++) {
			Bank.addOneYen();
		}
	}
}

public class MultiThreadExample {
	public static void main(String[] args) {

		Customer[] customer = new Customer[100];
		for(int i = 0; i<100; i++) {
			customer[i] = new Customer();
			customer[i].start();
		}

		for( int i=0; i<100; i++) {
			try {
				customer[i].join();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Bank.money);
	}
}
