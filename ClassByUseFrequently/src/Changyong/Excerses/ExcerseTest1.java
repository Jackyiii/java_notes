package Changyong.Excerses;

public class ExcerseTest1 {

	public static void main(String[] args) {
		
		
		//统计大写字母出现的次数
		String s1="feiyi";
		String newStr=toRevseString(s1);
		System.out.println(newStr);

		String s2="feiyifeifei";
		String s3="i";
		int a=toStringIndex(s2,s3);
		System.out.println(a);
		
		//统计大写次数
		String s4="dddhaHHWHdkajHLAd";
		int timesUpperCase=UpperCaseTimes(s4);
		System.out.println(timesUpperCase);
	}
	//将字符串反转，abc变成cba
	public static String toRevseString(String s1) {
		String newString = null;
		char[] c=s1.toCharArray();
		char[] newCharArray=new char[c.length];
		for(int i=0;i<c.length;i++) {
			newCharArray[i]=c[c.length-1-i];
		}
		newString =String .valueOf(newCharArray);
		return newString;
	}
	//统计一个字符串里面一个子串出现的次数
	public static int toStringIndex(String s1,String s2) {
		int times = 0;
		char[] c=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(String.valueOf(c[i]).equals(s2)) {
				times++;
			}
		}
		return times;
	}
	//统计大写次数
	public static int UpperCaseTimes(String s1) {
		int times= 0;
		char[]c=s1.toCharArray();
		byte[]b=new byte[c.length];
		for(int i=0;i<c.length;i++) {
			b[i]=(byte)c[i];
			//System.out.println(b[i]);
		}
		for(int j=0;j<b.length;j++) {
			if( b[j]>=65 && b[j]<=90 ) {
				times++;
			}
		}
		return times;
	}
	

}
