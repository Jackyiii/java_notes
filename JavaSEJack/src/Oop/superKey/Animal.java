package Oop.superKey;

public class Animal {
	public String name="Animal";
	private String color;
	private String category;
	public Animal() {
		System.out.println("Animal constructor");
	}
	public Animal(String color,String category) {
		this.color=color;
		this.category=category;
		System.out.println(this.color+this.category);
	}
	
	public void eat() {
		System.out.println("Animal eat");
	}
}
