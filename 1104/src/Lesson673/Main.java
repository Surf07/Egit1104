package Lesson673;//Comparableインターフェースを用いたソート


import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{

	int age;
	String name;

	public Person( int a, String n) {

		age = a;
		name = n;
	}
	public String toString() {
		return name + ":" + Integer.toString(age);
	}

	@Override
	public int compareTo( Person p ) {
		return this.age - p.age;
	}
}

public class Main {
	public static void main(String[] av) {

		ArrayList<Person> al = new ArrayList<>();

		al.add( new Person(11,"Katsuo"));
		al.add( new Person(24,"sazae"));
		al.add( new Person(9,"wakame"));

		Collections.sort( al );
		System.out.println( al );
	}
}
