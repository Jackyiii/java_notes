package Oop.EqualsTest;
class Star{
	int id;
	String name;
	public Star(int id,String name) {
		this.name=name;
		this.id=id;
		
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Star) {
			Star s=(Star)obj;
			if(this.id==s.id &&this.name.equals(s.name)) {
				return true;
				//classcastException 类转型错误
			}
		}
			
		return false;
		
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		// 比较两个引用数据类型是否相等
		Object o1=new Object();
		Object o2=new Object();
		System.out.println(o1.equals(o2));
		Star s1=new Star(1001,"JackChen");
		Star s2=new Star(1001,"JackChen");
		System.out.println(s1.equals(s2));
		Object s3=s1;
		System.out.println(s1.equals(s3));

	}

}
