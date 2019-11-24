package Lesson659;//440


import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> foo = new ArrayList<Integer>();

		foo.add(10);
		foo.add(20);
		foo.add(30);

		ArrayList<Integer> bar = (ArrayList<Integer>)foo.clone();
		for(Integer i : bar) {
			System.out.println(i);
		}
	}
}
