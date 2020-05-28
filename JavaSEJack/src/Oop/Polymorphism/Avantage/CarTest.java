package Oop.Polymorphism.Avantage;

public class CarTest {

	public static void main(String[] args) {
		Persons james=new Persons();
		Benz bc=new Benz();
		james.drive(bc);
		Bmw bm=new Bmw();
		james.drive(bm);
		
		james.drive(bc);
		
	}

}
