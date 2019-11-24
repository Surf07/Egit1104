package Lesson650;//428



import java.util.ArrayList;
import java.util.Iterator;



public class ListToArraySample {

	private static final int O = 0;

	public static void main(String args[]) {

		ArrayList<String>al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");

		String[] s = (String[])al.toArray(new String[0]);

		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
}
