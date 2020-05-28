package Changyong.String2;

public class getBytesArray {

	public static void main(String[] args) {
		String s1="feifei";
		byte[]b1=s1.getBytes();
		for(byte b:b1) {
			System.out.print(b+" ");
		}
	}

}
