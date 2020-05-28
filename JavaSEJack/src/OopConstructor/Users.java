package OopConstructor;

public class Users {
	private int age;
	private String name;
	public Users() {
		System.out.println("无参数构造方法");
	}
	public Users(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("name is "+this.name+" the age is "+this.age);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public int getAge() {
		return this.age;
	}
}
