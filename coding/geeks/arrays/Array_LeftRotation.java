/*
 * Problem Statement: Write a method that rotates/shifts an array by 'd' elements.
 * GFG Link: https://www.geeksforgeeks.org/array-rotation/
 */
import java.util.Arrays;


public class Array_LeftRotation
{
	/*
	 * Time Complexity = O(n)
	 * Space Complexity = O(d)
	 */
	public static int[] leftRotate_UsingTempArray(int a[], int d)
	{
		if(a.length==1)
			return a;
		
		//storing the first d elements in temporary array.
		int temp[] = new int[d];
		for(int i=0; i<d; i++)
			temp[i] = a[i];
		
		//shifting the elements of the array starting from position d till the last element left by d positions
		for(int i=d; i<a.length; i++)
			a[i-d] = a[i];
		
		//moving the copying the elements from temporary array towards the tail of the original array 
		for(int i=0; i<d; i++)
			a[a.length-d+i] = temp[i];
		
		//finally return the array after tha above 3 operations.
		return a;
	}
	
	/*
	 * Time Complexity = O(n*d)
	 * Space Complexity = O(1)
	 */
	public static int[] leftRotate_OneByOne(int a[], int d)
	{
		int temp;
		if(a.length==1)
			return a;
		
		for(int i=0; i<d; i++)
		{
			temp = a[0];
			//starting from the second till the last element, shift the elements left by 1 position. Finally move the first element to the last array position
			for(int j=1; j<a.length; j++)
			{
				a[j-1] = a[j];
			}
			a[a.length-1] = temp;
		}
		return a;
	}
	
	public static void main(String args[])
	{
		int testArray[] = {1,2,3,4,5};
		int noOfPlacesToRotate = 2;
		
		//Do not print the output of all the methods together. In doing so, the output of first becomes the input to the second.
		//System.out.println(Arrays.toString(leftRotate_UsingTempArray(testArray,noOfPlacesToRotate)));
		System.out.println(Arrays.toString(leftRotate_OneByOne(testArray,noOfPlacesToRotate)));
	}
}
