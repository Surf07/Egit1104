package Lesson607;


public class ConstructorSample5 {

	String name;
	int amount;

	ConstructorSample5(int i){
		this("sample");
	}

	ConstructorSample5(String str){
		this(str,1969);
	}

	ConstructorSample5(String str, int i){
		this.name = str;
		this.amount = i;
	}

	public static void main(String[] args) {
		ConstructorSample5 sample5 = new ConstructorSample5("Kazu");
		ConstructorSample5 sample6 = new ConstructorSample5(100000);

		System.out.println(sample5.name);
		System.out.println(sample6.amount);

	}
}
