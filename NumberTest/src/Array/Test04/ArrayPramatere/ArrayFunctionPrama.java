package Array.Test04.ArrayPramatere;

public class ArrayFunctionPrama {

	public static void main(String[] args) {
		int[] intArray= {1,23,2};
		m1(intArray);
		for(int a:intArray) {
			System.out.println(a);
		}
	}
	public static void m1(int[]a) {
		for(int e:a) {
			System.out.println(e);
		}
		a[1]=44;
	}
	
	

}
