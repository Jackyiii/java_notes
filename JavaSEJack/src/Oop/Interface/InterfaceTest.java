package Oop.Interface;

public class InterfaceTest {

	public static void main(String[] args) {
		// java 使用interface来声明是一个接口，接口其实就是特殊的抽象类，接口的方法全部都是抽象的
		//接口中只能出现抽象方法和常量
		//接口里面没有构造方法，无法创建接口的对象
		//接口和接口之间支持多继承，即一个接口可以有多个父接口
		//一个类可以实现多个接口
		//一个类实现了接口就需要重写接口中的所有的抽象方法，如果不重写，这个类需要声明为抽象类，不推荐使用
		
	}

}
class InterfaceTestT implements InterFaceTest1,InterFaceTest2{
	public void m1() {
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	};
}
