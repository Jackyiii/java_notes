package Array.SelectSort;

public class SelectSort {

	public static void main(String[] args) {
		int[]a= {4,2,7,3,6};
		//遍历数组长度-1即可完成排序
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					//获取最小值所在数组的下标
					min=j;
					
				}
			}
			if(min!=i) {
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
				
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
