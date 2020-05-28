package Oop04Fengzhuang;
//封装是隐藏对象的属性和实现细节，仅对外提供共有的访问方式
//封装的有点
//隐藏代码的实现细节，提高安全性

public class OopTest04Fengzhuang {

	public static void main(String[] args) {
		Students01 s1=new Students01();
		s1.setAge(-10);
		System.out.println(s1.getAge());
		s1.setName("good");
		System.out.println(s1.getName());
		
	}

}
