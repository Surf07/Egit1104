package Lesson665;



public class ForStatementChangingExpression {
	public static void main(String[] args) {

		System.out.println("[1]式: number <= 8");
		for(int number = 1; number <= 8; number ++) {
			System.out.println("[2]-" + number + "");
		}
		System.out.println("");

		System.out.println("[4]式: number <=9");
		for(int number =1; number <=9; number ++) {
			System.out.println("[5]-" + number + "");
		}
		System.out.println("");

		System.out.println("[7]式: number <= 10");
		for(int number = 1; number <=10; number++) {
			System.out.print("[9]-" + number + "");
		}
	}
}
