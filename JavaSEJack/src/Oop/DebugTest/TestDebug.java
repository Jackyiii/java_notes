package Oop.DebugTest;

public class TestDebug {

	public static void main(String[] args) {
		int a =0;
		System.out.println(a);
		TestDebugFunction();
		//F6断点单步测试
		//F8跳出F8执行后面的
		
		//F5进入到具体方法中
		int b=1;
		System.out.println(b);
	}

	private static void TestDebugFunction() {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
