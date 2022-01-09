/*1. Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays.*/
import java.util.Arrays;
public class JavaProb1 {

	public static void main(String[] args) {
		int arr[]= {58,24,13,15,63,9,8,81,1,78};
		int len=arr.length;
		
		int a[]=new int[(len+1)/2];
		int b[]=new int[len- a.length];
		
		for(int i=0;i<len;i++)
		{
			if (i < a.length) {
				a[i] = arr[i];
			}
			else {
				b[i - a.length] = arr[i];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	

		}

	}


