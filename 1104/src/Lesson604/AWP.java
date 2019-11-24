package Lesson604;


public class AWP {


	public static void main(String[] args) {

		new Thread( new Runnable() {

			public void run() {
				for(int i = 1; i<10; i++) {

					System.out.println( i + "回目のスレッド0");
					try {
						Thread.sleep((int)(Math.random()*1000));
					} catch(Exception e) {}
				}
			}
		}).start();

		new Thread (new Runnable() {

			public void run() {
				for (int i = 1; i<10; i++) {
					System.out.println( i + "回目のスレッド1");
					try {
						Thread.sleep((int)(Math.random()*1000));
					}catch(Exception e) {}
				}
			}
		}).start();

		new Thread(new Runnable() {

			public void run() {
				for(int i=1; i<10; i++) {
					System.out.println(i + "回目のスレッド２");
					try {
						Thread.sleep((int)(Math.random()*1000));
					}catch(Exception e) {}

				}
			}
		}).start();
	}
}
