package Lesson675;//配列を用いたソート

import java.util.Arrays;


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

		Person[] arr = { new Person(11,"Katsuo"),
	                     new Person(24,"sazae"),
	                     new Person(9,"wakame")};

        Arrays.sort( arr,(a,b)-> a.age - b.age);
        for (Person p : arr ) {
        	System.out.println( p );
        }
	}
}
