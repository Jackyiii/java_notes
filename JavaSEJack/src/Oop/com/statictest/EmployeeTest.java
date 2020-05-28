package Oop.com.statictest;

public class EmployeeTest {
	private String name;
	static String company="Alibaba";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	//静态的没有在堆当中不是对象和引用，是存放在方法区当中
	
	
}
