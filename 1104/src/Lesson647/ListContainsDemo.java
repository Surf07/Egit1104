package Lesson647;//425


import java.util.ArrayList;
import java.util.List;

public class ListContainsDemo {
	public static void main(String[] args) {

		List lst = new ArrayList();
		lst.add("あいうえお");
		lst.add("かきくけこ");
		lst.add("さしすせそ");

		String[] searchTargets = {"かきくけこ","たちつてと"};
		for(String s: searchTargets) {
			if(lst.contains(s)) {
				System.out.println("リストは以下の要素を含みます:" +s);
			}else {
				System.out.println("リストは以下の要素を含みません:" +s);
			}
		}

		List anotherList = new ArrayList();
		lst.add("かきくけこ");
		lst.add("さしすせそ");

		System.out.println(lst.containsAll(anotherList));

	}
}
