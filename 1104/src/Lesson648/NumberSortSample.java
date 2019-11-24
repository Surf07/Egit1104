package Lesson648;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSortSample {
	public static void main(String args[]) {

		ArrayList<Integer>al = new ArrayList<Integer>();

		al.add(Integer.valueOf(5));
		al.add(Integer.valueOf(2));
		al.add(Integer.valueOf(8));
		al.add(Integer.valueOf(1));
		al.add(Integer.valueOf(3));

		Collections.sort(al);
		System.out.println(al);

		Collections.reverse(al);
		System.out.println(al);

	}
}
