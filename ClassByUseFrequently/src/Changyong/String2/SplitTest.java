package Changyong.String2;

public class SplitTest {

	public static void main(String[] args) {
		String s1="f,e,i,y,i";
		String []array1=s1.split(",");
		for(String e:array1) {
			System.out.print(e+" ");
		}
	}

}
