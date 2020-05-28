package Array.BinarySearchs;

public class BinarySearchTest {

	public static void main(String[] args) {
		int []a= {1,4,5,6,7,9,20,30,39};
		int destElement=20;
		
		int res=BinarySearch(a, destElement);
		System.out.println(res);
	}

	private static int BinarySearch(int[] a, int destElement) {
		int begin=0;
		int end=(a.length-1);
		while(begin<=end) {
			int middle=(begin+end)/2;
			if(a[middle]==destElement) {
//				System.out.println("find it!"+middle);
				return middle;
			}else if(a[middle]>destElement) {
				//前半部分
				end=middle-1;
			}else if(a[middle]<destElement) {
				//后半部分
				begin=middle+1;
			}
		}
		return -1;
	}

}
