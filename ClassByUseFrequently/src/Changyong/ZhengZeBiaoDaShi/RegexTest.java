package Changyong.ZhengZeBiaoDaShi;

public class RegexTest {

	public static void main(String[] args) {
		String s1="feiyi12,feiyi 21 fei 2t y6qtrf4y5h";
		//将字符串的数字修改成中
		String s2=s1.replaceAll("\\d", "帅");
		System.out.println(s2);
		String s3="mm";
		System.out.println(s3.matches("ˆm{2}$"));
		String email="admin@google.";
		System.out.println(email.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$"));
		
	}

}
