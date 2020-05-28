package Exception.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest {

	//可以catch多个Exception，顺序是从小到大，先catch子类，然后在catch父类
	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("1");
			fis.read();
			//java7以上的写法，可以在同时捕捉同一级别的异常
		} catch (FileNotFoundException | NullPointerException e) {
			//打印堆栈信息/
			//tryCatch是自己进行处理捕获异常
			e.printStackTrace();
			String msg=e.getMessage();
			System.out.println(msg);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("catch语句后面测试");
	}

}
