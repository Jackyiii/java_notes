package Array.ArraysOutils;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[]args) {
		int[]a= {6,1,2,3,45,6,78,3,4,5,55,625};
		int[]b= {6,1,2,3,45,6,78,3,4,5,55,625};
		System.out.println(Arrays.equals(a, b));//排序与不排序的打印的会是false
		//工具类Arrays
		Arrays.sort(a);
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("--------------------");//
		//二分法查找，先排序然后调用方法
		int res=Arrays.binarySearch(a, 55);
		System.out.println(res);
		System.out.println("------");
		System.out.println(Arrays.toString(a));
		
		
	}
}
