package Oop.ToStringTest;

//Object 里的toString方法就是用来被子类重写的
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public String toString() {
		return "Person[name="+name+",age="+age+"]";
	}
	
}
public class ToStringTest {

	public static void main(String[] args) {
		Object o1=new Object();
		System.out.println(o1.toString());
		
		Person p=new Person("a",50);
		System.out.println(p.toString());
		Person p2=new Person("b",50);
		System.out.println(p2.toString());
		
		//如果直接打印对象会调用toString方法
		System.out.println(p);
	}

}
