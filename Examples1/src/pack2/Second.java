package pack2;

import mypackage.Car;
import pack1.First;

public class Second extends Car {

	private static Car car1;

	public static void main(String[] args) {

		First obj1 = new First();
		obj1.msg1();
		
		car1= new Car();
		car1.data=5;
	}

}
