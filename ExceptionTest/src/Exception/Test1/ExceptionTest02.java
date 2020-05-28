package Exception.Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest02 {

	//throws 将异常抛出
	//Add throws declartion
	//try catch
	public static void main(String[] args) throws FileNotFoundException{	
		FileInputStream fis=new FileInputStream("/Users/jackyi/Git_Proj/Java_Project/ExceptionTest/src/Exception/Test1/NotesException");
	}

}
