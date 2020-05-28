package Array.ErWEiArray;

public class ErWeiTest {

	public static void main(String[] args) {
		int [][]a= {
				{1,23},
				{1,2,3,4},
				{2,3,4,5}
		};
		for(int[] e:a) {
			for(int j:e) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
