package Changyong.StringsTest;

public class StringTest {

	public static void main(String[] args) {
		//final class String->不能有子类
		//extends OBject
		//implements Serializable，Comparable<String>,CharSequence
		String s1="fei fei";
		String s2="fei fei";
		s1="feiyi";
		System.out.println(s1);
		System.out.println(s2);
		//JVM里有一块常量池的内存区域
		//用来存放字符串对象
		//有利于提高执行效率
		//压栈，创建s1-》系统去常量池里找一下有没有feifei，如果没有字符串常量池会开辟一块内存，把feifei存入
		//后来，创建了s2系统去常量池有没有feifei发现有，不会创建，将s2指向刚才创建的内存地址，s1和s2都指向了常量池中同一块内存地址
		//改变s1的值，系统去常量池找，没有，开辟新的内存空间，然后将s1指向
		//字符串对象创建后是不可修改的
		
		//创建字符串有两种方式
		String s3="hello";//字符串常量中存放
		String s4=new String("fei");//字符串常量中，在堆中也会存放
		
		String s5="a";
		String s6="a";
		String s7=new String("c");
		String s8=new String("c");	
		System.out.println(s5==s6);//常量池-》指向的内存地址相同
		System.out.println(s5.equals(s6));
		System.out.println(s7==s8);//开辟两个堆内存空间
		System.out.println(s7.equals(s8));		
		
		//笔试题
		String s10=new String("aaa");
		String s11=new String("aaa");
		//堆内存一个，常量池一个
		//堆内存在创建一个
		
		String s12="a";
		String s13="b";
		String s15="ab";
		String s14=s12+s13;
		System.out.println(s14==s15);
		//会开辟空间，尽量减少字符串频繁拼接
	}

}
