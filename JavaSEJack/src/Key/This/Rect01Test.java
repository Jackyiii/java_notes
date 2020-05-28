package Key.This;

public class Rect01Test {
	private int width;
	private int height;
	
	public Rect01Test() {
		
	}
	public Rect01Test(int width,int height) {
		this.width=width;
		this.height=height;
		
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return this.height;
	}
	public int Area() {
		return this.width*this.height;
	}
	public int Perimeter(){
		return 2*(this.width+this.height);
	}
}	
