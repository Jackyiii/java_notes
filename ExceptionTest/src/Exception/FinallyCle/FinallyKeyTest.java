package Exception.FinallyCle;

public class FinallyKeyTest {

	public static void main(String[] args) {
		//选择语句快然后点击command+option+z
		try {
			System.out.println(1024/0);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("catch中的语句");
		}finally {
			System.out.println("finally");
		}
	}

}
