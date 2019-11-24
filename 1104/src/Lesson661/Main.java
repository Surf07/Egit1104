package Lesson661;//442

import java.util.ArrayList;

//シャローコピーは新しくインスタンスを生成せずListを代入して行う参照

public class Main {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");

		ArrayList<String> list2 = list1;
		list1.set(0,  "x");
		list2.set(1,  "y");

		System.out.println("コピー元のList");
		for(String s : list1) {
			System.out.print(s);
		}

		System.out.println("コピー先のList");
		for(String s : list2) {
			System.out.print(s);
	 }
   }
}
