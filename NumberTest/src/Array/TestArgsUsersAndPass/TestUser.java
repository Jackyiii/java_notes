package Array.TestArgsUsersAndPass;

import java.util.Scanner;

public class TestUser {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String usr="";
		@SuppressWarnings("unused")
		int age=0;
		@SuppressWarnings("unused")
		String passw="";
		
		System.out.println("请输入用户名");
		Scanner userInput=new Scanner(System.in);
		usr=userInput.nextLine();
		
		System.out.println("请输入年龄");
		Scanner ageInput=new Scanner(System.in);
		age=Integer.parseInt(ageInput.nextLine());
		
		System.out.println("请输入密码");
		Scanner passInput=new Scanner(System.in);
		passw=passInput.nextLine();
		TestUserName(usr,age,passw);
	}
	public static void TestUserName(String username,int age,String pass) {
		String uname="admin";
		int uage=20;
		String upass="123";
		if( username.equals(uname) && (uage==age) && upass.equals(pass) ) {
			System.out.println("验证正确，欢迎回来");
		}else {
			System.out.println("用户名或密码有误请重新输入");
		}
	}

}
