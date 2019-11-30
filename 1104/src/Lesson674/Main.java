package Lesson674;//Comparatorを用いたソート

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

		ArrayList<Person> al = new ArrayList<>();

		al.add( new Person(11,"Katsuo"));
		al.add( new Person(24,"sazae"));
		al.add( new Person(9,"wakame"));

		Collections.sort( al, new Comparator<Person>() {
			@Override
			public int compare(Person a, Person b) {
				return a.age - b.age;
			}   //Comparator型を無名クラスで生成。内部的にはラムダ式とやっていることは同じ。
		});
		System.out.println( al );
	}
}
