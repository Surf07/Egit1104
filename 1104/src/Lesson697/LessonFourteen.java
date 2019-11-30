package Lesson697;//Derek Banas Java14



class Animal{

	private String name = "Animal";
	public String favFood = "Food";

	protected final void changeName(String newName) {
		this.name = newName;

	}

	protected final String getName() {
		return this.name;
	}

	public void eatStuff() {
		System.out.println("Yum" + favFood);
	}

	public void walkAround() {
		System.out.println(this.name + " walks around");
	}

	public Animal() {
	}

	public Animal(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}
}


 class Cat extends Animal{

	public String favToy = "Yarn";

	public void playWith() {
		System.out.println("Yeah" + favToy);
	}

	public void walkAround() {
		System.out.println(this.getName() + " stalks around and then sleeps");
	}

	public String getToy() {
		return this.favToy;
	}

	public Cat() {
	}

	public Cat(String name, String favFood, String favToy) {

		//super calls the constructor for the super class Animal
		super(name, favFood);

		//We set the favToy value in Cat because it doesn't exist in the Animal class
		this.favToy = favToy;
	}
}


public class LessonFourteen {
	public static void main(String[] args) {

		// I create a Animal object named genericAnimal
		Animal genericAnimal = new Animal();
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);

		// I create a Cat class like any other
		Cat morris = new Cat("Morris","Tuna","Rubber Mouse");

		//Print out the name, favFood and favToy
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);

		//You can also create classes based on the super class
        Animal tabby = new Cat("Tabby", "Salmon","BAll");

        //You pass objects like any other field
        acceptAnimal(tabby);

	}

	public static void acceptAnimal(Animal randAnimal) {

		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);

		randAnimal.walkAround();

		Cat tempCat = (Cat) randAnimal;
		System.out.println(tempCat.favToy);

		System.out.println(((Cat) randAnimal).favToy);

		if(randAnimal instanceof Cat)
		{
			System.out.println(randAnimal.getName() + " is a Cat");
		}

	}
}
