package Lesson609;


import java.util.Scanner;


public class InputSample {

	String name;

	InputSample(String str){
		this.name = str;
	}


	public static void main(String[] args) {

		Scanner scan = new Scanner("Kazu");
		String str = scan.nextLine();

		System.out.println(str);
		scan.close();
	}

}
