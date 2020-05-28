package Oop.Polymorphism.Avantage;

public class Persons {
//	public void drive(Benz bc) {
//		bc.run();
//	}
//	public void drive(Bmw bm) {
//		bm.run();
//	}
	//面向抽象编程
	//代码扩展性高
	//先传抽象高的，然后具体创建实例调用具体的，因为重写的存在他可以调用它的子类对象的方法
	public void drive(Cars c) {
		c.run();
	}
}
