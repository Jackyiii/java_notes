package Key.This;

public class Actors {
	private String name;
	private int age;
	public void m1() {
		String name="a1";
		System.out.println(name);//就近原则
		System.out.println(this.name);//调用对象引用
	}
	public void m2() {
		System.out.println(name);//无法访问局部变量
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
}
