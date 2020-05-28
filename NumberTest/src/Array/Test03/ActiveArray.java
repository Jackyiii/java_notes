package Array.Test03;

public class ActiveArray {

	public static void main(String[] args) {
		//动态初始化数组,动态创建为4的数组
		int []intArray=new int[3];
		for(int e:intArray) {
			
			System.out.println(e);
		}
		Object[]ojArray=new Object[2];
		for(Object e:ojArray) {
			System.out.println(e);
		}
	}
	//数组的特点是查询速度快
	//例如页码的顺序不是连续的，查询速度就会变慢
	//因为他是连续的
	//一旦初始化大小，一旦想改变大小麻烦
	
	//静态初始化
	//int []intArray={12,2};
	//动态初始化
	//int []intArray=new int[3];
	//如果一开是知道数组里的元素则用静态初始化数组
	//如果一开始不知道元素则用动态初始化
	
	
	//动态创建数组的内存情况
	//1ArrayTest03加载到方法区
	//2执行main方法
	//3创建长度是4的数组
	//4在堆内存中开辟一块空间用来存放数组
	//5数组的下标分别是0123
	//6一开始没有赋值都是0
	//在栈中赋值后
	//在堆中有值

}
