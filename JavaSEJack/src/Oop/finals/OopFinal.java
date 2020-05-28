package Oop.finals;

	//final修饰的基本数据类型值不能改变
	//final修饰的引用数据类型内存地址不能改变，但是里面的值可以修改
public class OopFinal {

	//一般情况final 与static同时使用
	public static final int LK=10;//常量常量的标识符要大写
	//final修饰的成员变量必须进行初始化
	
	//final修饰对象无法指向另外的对象，但对象里面的值可以改变
	//final修饰的对象内存地址确定，无法改变
	
//	public final int k;
	public static void main(String[] args) {
		//final关键词
		//final修饰的类无法被继承
		//final修饰的方法无法被重写
		//final修饰的局部变量一旦赋值无法在改变
		//final修成的成员变量必须进行初始化
		
		//final修饰的变量赋值无法改变
//		final int i=10;
//		i=20;
	}
}
//final修饰的类无法拥有子类
//final class A{
//	
//}
//class B extends A{
//	
//}


//final方法无法被重写
//class C{
//	public final void m1() {
//		
//	}
//}
//class D extends C{
//	public void m1() {
//		
//	}
//}
