package Oop.OverRide;

public class OopOverRideTest {

	public static void main(String[] args) {
		//重写，当父类中的方法没有办法满足子类的需求时，子类可以将父类的方法进行重写，来满足需求
		//条件：
		//1两个类必须是继承关系
		//必须拥有相同名的方法，相同返回值类型，相同的参数类型
		//重写的方法不能比被重写的方法拥有更低的访问权限
		//重写方法不能比被重写的方法拥有更宽泛的异常
		//私有的方法没有办法被重写
		//构造方法没有办法被重写
		//静态的方法不存在重写
		//重写指的是成员方法，和成员变量没有关系
		Cats c=new Cats();
		c.eat();
		Dogs d=new Dogs();
		d.eat();
	}

}
