package Lesson656;



public class App8_1_3 {
	
	
	public App8_1_3() {
		int data = 1;
		System.out.println("1.呼び出し元 = " + data);
			
		changeMessage(data);
		
		System.out.println("4.呼び出し元 = " +data);
	}
	
public void changeMessage(int data) {
	System.out.println("2.変更前 = " + data);
	     data = 10;
	System.out.println("3.変更後 = " + data);
}
}
