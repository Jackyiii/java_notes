package OopDaiMaKuai;

public class OopDaiMaKuai {

	public static void main(String[] args) {
		//局部代码块---在方法中，限定变量的生命周期，及早释放，提高内存的利用率
		//构造代码块---在类中方法外出现，多个构造方法中相同的代码块存放到一起，每次调用构造都执行，并且在构造方法前执行
		//静态代码块---在类中方法外出现，并加上static修饰，用于给类进行初始化，在加载的时候就执行，并且只执行一次，
		//一般用于加载驱动
		//同步代码块
		
		//局部代码块
		{
			int x=10;
			System.out.println(x);	
		}
		Student s=new Student();
		System.out.println("----------------------");
		Student s1=new Student();
	}
	static {
		System.out.println("main静态代码块");	
	}
}
class Student{
	public Student() {
		System.out.println("构造方法");
	}
	//构造代码块
	{
		System.out.println("构造代码块");
	}
	//静态代码块
	static {
		System.out.println("student静态代码块");	
	}
}
