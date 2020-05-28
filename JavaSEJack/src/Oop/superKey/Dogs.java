package Oop.superKey;

public class Dogs extends Animal{
	public String name="wang cai";
	public void eat() {
		System.out.println("gou lang");
	}
	
	public Dogs() {
		super("red","Gold");
		System.out.println("Dog Constructor");
		
	}
	
	public void m1() {
		System.out.println(super.name);
		System.out.println(this.name);
		super.eat();
		this.eat();
	}
}