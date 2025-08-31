// Example of dynamic method dispatch (DMD)

package polymorphism;

class Car1{
	void run () {
		System.out.println("Running");
	}
}

public class Thar extends Car1 {
	
	void run () {
		System.out.println("Running offroad");
	}

	public static void main(String[] args) {
		Car1 c = new Thar(); // upcasting
		c.run();

	}

}
