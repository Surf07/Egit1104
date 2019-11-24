package Lesson610;

import java.util.Scanner;

public class InputSample {

	int num1;

	InputSample(int i){
		this.num1 = i;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt(30);
		int num2 = scan.nextInt(5);
		int sum = num1 + num2;

		System.out.println(num1 + "+" + num2 + "=" + sum);
		scan.close();
	}

}
