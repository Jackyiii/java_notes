package Oop.InterfaceAndClass.main;

import Oop.InterfaceAndClass.Cars;
import Oop.InterfaceAndClass.impl.Benz;

public class TestCar {

	public static void main(String[] args) {
		Cars c=new Benz();
		c.run();
	}

}
