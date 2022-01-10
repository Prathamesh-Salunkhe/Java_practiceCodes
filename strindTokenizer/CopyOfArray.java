package strindTokenizer;

public class CopyOfArray {
   public static void main(String[] args) {
	int[] arr1= {34,23,34,45,66,76};
	System.out.println("hashcode of array1= "+arr1.hashCode());
	int[] arr2=arr1;
	System.out.println("================");
	for(int i:arr2) {
		System.out.println(i);
	}
	System.out.println("================");
	int[] arr3=new int[10];
	arr3=arr2;
	for(int i:arr3) {
		System.out.println(i);
	}
}
}
