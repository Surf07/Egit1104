package Lesson698;//Derek Banas Java15




interface Drivable{


	double PI = 3.14159265;

	int getWheels();


	void setWheels( int numWheels);

	double getSpeed();

	void setSpeed(double speed);

}

abstract class Crashable{

	boolean carDrivable = true;

	public void youCrashed() {
		this.carDrivable = false;
	}

	public abstract void setCarStrength( int carStrength);
	public abstract int getCarStrength();
}


/* You define that you want a class to use an interface
 * with the implements keyword. This class must create
 * a method for each method defined in Drivable
 * You can implement more than 1 interface like this
 * public class Vehicle implements Drivable, Crashable
 */
// You make a class part of an abstract class by using
//the extends keyword

class Vehicle extends Crashable implements Drivable {

	int numOfWheels = 2;
	double theSpeed = 0;

	int carStrength = 0;

	// All methods must be as visible as those in the
	// interface. If they are public in the interface
	// they must be public in the subclass
	public int getWheels(){
		return this.numOfWheels;
	}

	public void setWheels(int numWheels){
		this.numOfWheels = numWheels;
	}

	public double getSpeed(){
		return this.theSpeed;
	}

	public void setSpeed(double speed){
		this.theSpeed = speed;
	}

	public Vehicle(int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}

	public void setCarStrength(int carStrength){
		this.carStrength = carStrength;
	}

	public int getCarStrength(){
		return this.carStrength;
	}

}

public class LessonFifteen {

	public static void main(String[] args){

		Vehicle car = new Vehicle(4, 100.0);

		// Using methods from the interface Drivable
		System.out.println("Cars Max Speed: "+car.getSpeed());
		System.out.println("Cars Number of Wheels: "+car.getWheels());

		// Using methods from abstract method Crashable
		car.setCarStrength(10);
		System.out.println("Car Strength: "+car.getCarStrength());

	}

}

