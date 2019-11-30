package Lesson672;//ラムダ式を用いるソート

import java.util.ArrayList;

class Person{

	int age;
	String name;

	public Person( int a, String n) {

		age = a;
		name = n;
	}

	public String toString() {
		return name + ":" + Integer.toString(age);
	}
}

public class Main {
	public static void main(String[] av) {
		ArrayList<Person> al = new ArrayList<Person>() {
			{
				add( new Person(11,"katsuo"));
				add( new Person(24,"sazae"));
				add( new Person(9,"wakame"));
			}
		};
		al.sort((a,b)-> a.age - b.age); /*ラムダ式＝(仮引数列) -> {処理}; だよ。年齢順、右辺が一行の場合、それが返り値になる*/
		System.out.println( al);

		al.sort((a,b)->a.name.compareTo(b.name));/*名前順でソート。StringのメソッドCompareToでラムダ式を呼び出す*/
		System.out.println( al);
	}
}
