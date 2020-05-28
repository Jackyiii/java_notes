package Array.Test02;

public class ArrayTest02 {

	public static void main(String[] args) {
		int []intArray= {1,2,3};
		for(int e:intArray) {
			System.out.println(e);
			
		}
		System.out.println(intArray.length);
		//如果报错：java.lang.ArrayIndexOutOfBoundsException表示数组越界
	}

}
