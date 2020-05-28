package Oop.Polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {
		// 多态就是事物存在的多种形态在java中如果符合三种情况就是多态
		//有继承
		//有方法重写
		//有父类引用子类对象
		//狗真凶猛，动物真凶猛，物种真凶猛指的都是这个藏獒
		Cats c=new Cats();
		c.eat();
		Animals a1=new Cats();//父类引用指向子类对象
		a1.eat();//动态绑定和静态绑定
		//编译阶段--程序eat当作是animal的eat方法静态绑定
		//程序运行的时候a指向的是cat对象，所以会调用cat的eat方法-动态绑定
		
		System.out.println(a1.num);//因为成员变量不存在重写，重写存在方法里面，并且在栈中
		//instanceof用法 instance实例
		//a1.move();
		//需要调用的话进行强制类型转换
		Cats c2=(Cats)a1;
		c2.move();
		//父类引用子类对象是向上转型
		//强制类型转换是向下转型
		Animals a2=new Dogs();
		
		//ClassCastException-----类转型错误
		//Cats c3=(Cats)a2;
		//c3.move();
		Animals a3=new Dogs();
		//instanceof--在转型前进行判断
		if(a3 instanceof Cats) {
			Cats c3=(Cats)a3;
		}else {
			System.out.println("转换失败");
		}
		//instanceof 用于强制转换类型前的判断
		
	}

}
