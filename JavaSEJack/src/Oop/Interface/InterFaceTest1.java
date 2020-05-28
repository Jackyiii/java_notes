package Oop.Interface;

public interface InterFaceTest1 extends InterFaceTest3{
	public static final double PI=3.1415;
	double PII=3.13;
	public abstract void m1();
	void m2();
}
interface InterFaceTest2 {
	void m3();
}
interface InterFaceTest3 extends InterFaceTest2{
	void m4();
}
