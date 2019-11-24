package Lesson657;//438


import java.util.ArrayList;

public class ArrayTest {
	public static void main(String args[]) {

		ArrayList<String> sakana = new ArrayList<String>();

		sakana.add("金魚");
		sakana.add("出目金");
		sakana.add("鮟鱇");
		sakana.add("鯖");

		for(int i = 0; i<sakana.size(); i++) {
			System.out.println(sakana.get(i));
		}
		sakana.set(2, "鰻");
		System.out.println();

		for(int i =0; i<sakana.size(); i++) {
			System.out.println(sakana.get(i));
		}
	}
}
