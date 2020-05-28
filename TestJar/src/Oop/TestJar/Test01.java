package Oop.TestJar;

import Oop.InterfaceAndClass.Cars;
import Oop.InterfaceAndClass.impl.Benz;

public class Test01 {

	public static void main(String[] args) {
		Cars c=new Benz();
		c.run();
	}

}
