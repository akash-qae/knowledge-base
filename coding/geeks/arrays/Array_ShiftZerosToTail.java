/*
 * Problem Statement: Move all zeroes to end of array
 * Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same.
 * GFG Link: https://www.geeksforgeeks.org/move-zeroes-end-array/
 */
import java.util.Arrays;


public class Array_ShiftZerosToTail
{
	/*
	 * Time Complexity = O(n)
	 * Space Complexity = O(n)
	 */
	public static int[] shiftZeros_ExtraSpace(int a[])
	{
		int index=0;
		int b[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				b[index] = a[i];
				index++;
			}
		}
		for(int i=index; i<a.length; i++)
			b[i] = 0;
		return b;
	}
	
	/*
	 * Time Complexity = O(n)
	 * Space Complexity = O(1)
	 * Concept: Maintain a varaible index with starting value as 0. Iterate through the elements of the array one by one.
	 * For each non-zero element, copy the element to index position and increment index by 1. After 1 complete traversal of the array
	 * all the non-zero elements must have moved towards the left and index is at first index of 0. Run a loop from 0 to last array position
	 * setting each element as 0.
	 */
	public static int[] shiftZeros_NoExtraSpace(int a[])
	{
		int index=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				a[index] = a[i];
				index++;
			}
		}
		for(int i=index; i<a.length; i++)
			a[i] = 0;
		return a;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,0,2,3,0,4,0,5};
		//System.out.println(Arrays.toString(shiftZeros_ExtraSpace(arr)));
		System.out.println(Arrays.toString(shiftZeros_NoExtraSpace(arr)));
	}
}
