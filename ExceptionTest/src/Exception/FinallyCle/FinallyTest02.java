package Exception.FinallyCle;

public class FinallyTest02 {

	public static void main(String[] args) {
		int result=m1();
		System.out.println(result);
		//finally会执行try之后的语句，除非jvm退出
	}
	public static int m1()
	{
		//try语句里面的，外面是无法访问的
		
		try {
			int i=1024;
			//System.exit(0);
			return i;
			
		} finally {
			System.out.println("finally");
		}

	}
}
