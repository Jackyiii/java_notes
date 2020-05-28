package OopConstructor;

public class ConstructorTest {

	//构造方法作用是给数据进行初始化
	//构造方法的特点的是
	//1方法名与类名相同注意大小写也要与类名相同
	//构造没有返回值
	//没有void修饰符
	//没有具体的return内容 
	//如果一个类没有提供任何构造方法，则系统会默认的调用无参数构造方法
	//如果一个类已经手动的提供了构造方法，那么系统不会在提供任何的构造方法
	
	public static void main(String[] args) {
		Users u1=new Users();
		Users u2=new Users("feifei",20);
		//不能手动去掉用构造方法
		//构造方法只能由系统自动调用
		//构造方法无参和有参在一起构成重载
		
	}

}
