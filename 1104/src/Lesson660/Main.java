package Lesson660;//441 ディープコピーが値渡し。


//ディープコピーは参照先のデータまでコピーするので、コピー元のListとコピー先のListが別々の値を持つListになります。

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");

		ArrayList<String> list2= new ArrayList<>(list1);
		ArrayList<String> list3 = (ArrayList<String>) list1.clone();

		list1.set(0,"x");
		list2.set(1,"y");
		list3.set(2,"z");

		System.out.println("コピー元のList");
		for(String s : list1) {
			System.out.println(s);
		}

		System.out.println("cloneメソッドでコピーしたList");
		for (String s : list3) {
			System.out.println(s);
		}
	}
}
