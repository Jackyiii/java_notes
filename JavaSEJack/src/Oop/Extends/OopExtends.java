package Oop.Extends;

public class OopExtends {

	public static void main(String[] args) {
		//继承是面向对象的三大特征之一，java语言支持单继承
		//一个类只有一个父类，子类可继承父类中非private修饰的成员变量和成员函数
		//如果没有显示的继承其他类，那么会默认的继承Object类
		//继承的优点：1提高了代码的可复用
		//2提高了代码的维护性
		//3让类与类之间产生了关系是多态的前提
		
		//缺点增强了累的耦合
		//内聚是一个模块哥哥元素彼此结合的紧密程度
		//耦合是一个软件里面不同模块的相互链接的数量
		SubClassTest s= new SubClassTest();
		s.m1();
		//s.m2();//无法修饰父类的m2的private方法
		s.m3();
		s.m0();

	}

}
