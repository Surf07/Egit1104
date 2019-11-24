package Lesson663;



public class SumFromOneToTen {
	public static void main(String[] args) {
		int sum = 0;

		for(int number = 1; number <=10; number++) {
			sum += number;
		}
		System.out.println("sum:" +sum);
	}
}
