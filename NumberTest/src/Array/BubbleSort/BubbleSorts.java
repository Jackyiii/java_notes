package Array.BubbleSort;

public class BubbleSorts {

	public static void main(String[] args) {
		int []a= {4,2,7,3,6,10,2};
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					//ArrayIndexOutOfBoundsException->数组越界
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1) {
				System.out.print(a[i]);
			}else {
				System.out.print(a[i]+",");
			}
		}
	}

}
