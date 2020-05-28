package Exception.Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest03 {

	//throws 是将问题暴露出来，是由调用者去处理，
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
	public static void m1() throws FileNotFoundException {
		m2();
	}
	public static void m2() throws FileNotFoundException {
		m3();
	}
	public static void m3() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("111");
	}

}
