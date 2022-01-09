/*If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the subarray lies between the indexes 3 and 8.*/
import java.util.*;
public class JavaProb2 {

	public static void main(String[] args) {
		int[] a = new int[] {10,12,20,30,25,40,32,31,35,50,60};

		int[] sub = Arrays.copyOfRange(a,3,9);

		System.out.println("Array is : ");

		for(int i = 0; i < a.length; i++){

		System.out.println(a[i]+"\t");

		}

		System.out.println("SubArray is : ");

		for(int i = 0; i < sub.length; i++){

		System.out.print(sub[i]+"\t");

		}
	}

}
