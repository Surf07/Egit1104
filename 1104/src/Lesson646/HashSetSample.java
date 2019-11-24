package Lesson646;



import java.util.HashSet;


public class HashSetSample{
	public static void main(String args[]) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Z");
		hs.add("Y");
		hs.add("X");
		hs.add(null);

		java.util.Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		for(String a: hs) {
			System.out.println(a);
		}
	}
}

