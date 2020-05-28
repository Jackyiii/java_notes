package Oop.com.statictest;

public class OopStatic {

	public static void main(String[] args) {
		//共享static归类所有，
		//static可以修饰变量，被static修饰的变量叫做静态变量
		//程序运行时静态变量存放在方法区，因此静态变量在类加载阶段赋值，有且只有一次
		//static可以修饰方法，被static修饰的方法叫做静态方法，不用创建对象就能访问该方法，
		//static可以修饰静态语句块，静态语句块在类加载的时候执行，而且是自上而下的顺序加载
		
		//
		EmployeeTest e=new EmployeeTest();
		System.out.println(e.company);
		e=null;
		System.out.println(e.company);
		//静态变量与对象无关，所以用类名。方式访问
		

	}

}
