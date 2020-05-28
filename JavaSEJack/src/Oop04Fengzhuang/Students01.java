package Oop04Fengzhuang;

public class Students01 {
	private String name;
	private int age;
	
	//对外提供公共的访问方式
	//需要编写set和get方法
	
	public void setAge(int age) {
		if(age>0&&age<120) {
			this.age=age;
		}else {
			System.out.println("年龄不符合常理，请重新尝试");
		}
		
	}
	
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
