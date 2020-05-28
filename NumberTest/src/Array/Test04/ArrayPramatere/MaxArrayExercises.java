package Array.Test04.ArrayPramatere;

public class MaxArrayExercises {

	public static void main(String[] args) {
		int []a= {1,3,5,4,6,7,4,5,3,6};
		maxArray(a);
	}
	public static int maxArray(int []intArray) {
		int maxValue=intArray[0];
		int []index=new int[intArray.length];
		int maxIndex = 0;
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]>maxValue) {
				index[i]=i;
				maxValue=intArray[i];
				maxIndex=index[i];
			}
		}
		System.out.println(maxValue);
		System.out.println(maxIndex);
		return maxValue;
	}

}
