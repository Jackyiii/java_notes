package Oop02;

public class Oop02 {

	public static void main(String[] args) {
		//实例化类
		Students s=new Students();
		String S01=s.name="s";
		//通过对象名加方法调用对象的方法
		s.love("Marry");
		s.excerse("football");
		s.study();
		System.out.print(S01);
	}

}
