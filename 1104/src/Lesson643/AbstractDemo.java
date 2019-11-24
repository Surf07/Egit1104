package Lesson643;



abstract class Animal{
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void animalCry() {
		System.out.println(name + "の鳴き方:" + cry());
	}

	abstract protected String cry();
}

class Cat extends Animal{
	public Cat() {
		super("猫");
	}

protected String cry() {
	return "ニャー";
}
}

class Dog extends Animal{
	public Dog() {
		super("犬");
	}

	protected String cry() {
		return "ワン";
	}
}

public class AbstractDemo {
	public static void main(String[] args) {

		Animal cat = new Cat();
		cat.animalCry();

		Animal dog = new Dog();
		dog.animalCry();
	}
}
