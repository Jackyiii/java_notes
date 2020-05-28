package Oop.superKey;

public class OopSuperKeyTest {

	public static void main(String[] args) {
		//Super关键字
		//super表示的当前子类对象的父类型特征
		//子类和父类都有某个数据，子类和父类都有name属性 如果子类要访问父类的name属性，需要使用super
		//子类重写了父类的方法如果子类需要调用父类的同名的方法，需要用到super
		//子类调用父类的构造方法的时候需要用super
		//子类不能使用静态方法static
		
		//系统会从子类的父类里调用无参的构造方法
		//不会创建对象只会调用
		
		Dogs d=new Dogs();
		d.m1();
		//System.out.println(d.color);
		//System.out.println(d.category);
		
	}

}
