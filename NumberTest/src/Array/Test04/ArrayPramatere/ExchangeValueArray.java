package Array.Test04.ArrayPramatere;

public class ExchangeValueArray {

	public static void main(String[] args) {
		
		int []a= {1,3,4,3,3,52,6,6};
		Exchange(a);
		for(int e:a) {
			System.out.println(e);
		}
		
	}
	public static void Exchange(int[]ex) {
		
		int arrLen=ex.length-1;
		int temps=0;
		for(int i=0;i<ex.length/2;i++) {
			temps=ex[i];
			ex[i]=ex[arrLen-i];
			ex[arrLen-i]=temps;
		}
		
		
//		a0=1    a0=5  a0->a[length(5)-1-i0]
//		a1=5    a1=4  a1->a[length(5)-1-i1]
//		a2=3    a2=3  a2->a[length(5)-1-i2]
//		a3=4    a3=5  a3->a[length5-1-i3]
//		a4=5    a4=1  a[i]->[a[length]-1-i]
	}

}
