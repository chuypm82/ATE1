// Overriding example:
//	- Used when parent and child class have a method with the same name
//	- Method must have the same parameters
//	- Used to provide specific implementation of the method
//	- the call to overriden methods are resolved at run time not compile time 
package polymorphism;

class Vehicle{
	void run () {
		System.out.println("Vehicle is moving");
	}
}
public class Car extends Vehicle{
	void run() {
		System.out.println("Car is moving");
	}

	public static void main(String[] args) {
		Car obj= new Car();
		obj.run();

	}

}


