package Lesson603;


import java.util.ArrayList;
import java.util.List;

public class Test {
	public static class Person{

		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {return this.name;}
		public int getAge() {return this.age;}
	}

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person("太郎",18));
		list.add(new Person("花子",17));
		list.add(new Person("権太",20));

		for(final Person person : list) {
			System.out.println(person.getName() + " " + person.getAge() + "歳");
		}
	}
}
