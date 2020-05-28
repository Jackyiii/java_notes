package Oop.Abstruct;

abstract class A{
	public A() {
		System.out.println("A de 构造方法");
	}
	public abstract void m1();
}
class B extends A{
	public void m1() {
		System.out.println("B的m1方法");
	}
	public B() {
		System.out.println("B的构造方法");
	}
}

public class AbstructTest {

	public static void main(String[] args) {
		// 抽象类
		//抽象类无法被实例化，即无法创建抽象类的对象
		//虽然抽象类无法被实例化，但是抽象类有构造方法，该构造方法是给子类创建对象用的，多态
		//抽象类不一定有抽象方法，但抽象方法必须存在抽象类中
		//抽象类的子类可以是抽象类，如果不是抽象累的话，必须对象类中的抽象方法进行重写
		//抽象类和抽象方法不能被final修饰
		//没有具体实现相当于定义了一种规范
		//例如usb接口生产厂商生产了无法适配的不同口de接口，会很不方便
		A a=new B();
		a.m1();

	}

}

