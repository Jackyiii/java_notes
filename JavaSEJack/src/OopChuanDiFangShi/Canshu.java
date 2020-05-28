package OopChuanDiFangShi;

public class Canshu {

	public static void main(String[] args) {
		//int i=10;
		//m1(i);
		//System.out.println("main方法i="+i); //10
		//java值传递
		//main方法压栈
		//创建int i=10
		//m1
		MathPlus s1=new MathPlus();
		s1.setAge(10);
		m2(s1);
		System.out.println("main function is "+s1.getAge());
	}
	public static void m1(int i) {
		//++i;
		//System.out.println("方法i="+i);//11
	}
	public static void m2(MathPlus a1) {
		int a2=a1.getAge();
		a1.setAge(++a2);
		System.out.println("m2中a2的值"+a2);
	}

}
