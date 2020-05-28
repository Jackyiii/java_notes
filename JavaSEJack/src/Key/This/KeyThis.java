package Key.This;

public class KeyThis {

	public static void main(String[] args) {
		//this 是java里面的一个关键字
		//他是引用类型
		//在堆中的每个java对象都有一个this指向自己
		//this代表带钱对象的引用
		//this可以区分成员变量和局部变量
		MyDate md=new MyDate();
		Actors a=new Actors();
		a.setName("a2");
		a.m1();
		a.m2();
		
		Rect01Test r=new Rect01Test(2,10);
		int area=r.Area();
		int pe=r.Perimeter();
		System.out.println("area is "+area+" perimeter is "+pe);
		
	}

}
