package Lesson664;



public class ForStatementChangingInitialization {
	public static void main(String[] args) {
		System.out.println("[1] 初期化:number = 1");

		for(int number = 1;number <=10;number ++){
			System.out.print("[2]-" + number + "");
		}
		System.out.println("");
		System.out.println("[4]初期化: number = 2");

		for(int number = 2; number <= 10; number ++) {
			System.out.print("[5]-" + number + "");
		}
		System.out.println("");
		System.out.println("[7]初期化: number = 3");

		for(int number =3; number <=10; number ++) {
			System.out.print("[9]-" + number + "");
		}
		System.out.println("");

	}
}
