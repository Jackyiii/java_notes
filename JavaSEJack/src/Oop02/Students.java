package Oop02;

public class Students {
	//成员变量不用进行初始化
	private int id;
	public String name;
	private boolean sex;
	private int age;
	
	public void study() {
		System.out.println("good Study");
	}
	public void love(String name) {
		System.out.println("find a girl friend with code"+name);
	}
	public void excerse(String sport) {
		System.out.println("Im doing "+sport);
	}
}
