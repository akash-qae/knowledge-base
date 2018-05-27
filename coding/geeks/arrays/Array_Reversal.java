/*
 * Problem Statement: Write a method that reverses the elements of the array
 * GFG Link: https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
import java.util.Arrays;
public class Array_Reversal
{
	/*
	 * Time Complexity = O(n)
	 * Space Complexity = O(1)
	 */
	public static int[] reverseArray(int a[])
	{
		int temp;
		int len = a.length;
		if(len==1)
			return a;
		for(int i=0; i<a.length/2; i++)
		{
			temp = a[i];
			a[i] = a[len-1-i];
			a[len-1-i] = temp;
		}
		return a;
	}
	
	/*
	 * Time Complexity = O(n)
	 * Space Complexity = O(n)
	 */
	public static int[] reverseArray_ExtraSpace(int a[])
	{
		int len = a.length;
		if(len==1)
			return a;
		int b[] = new int[len];
		for(int i=len-1; i>=0; i--)
			b[len-i-1] = a[i];
		return b;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};
		//System.out.println(Arrays.toString(reverseArray(arr)));
		System.out.println(Arrays.toString(reverseArray_ExtraSpace(arr)));
	}
}
