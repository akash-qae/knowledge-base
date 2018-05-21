/*
 * Date: 05/21/2018
 * Problem Statement Link: https://www.codechef.com/problems/INTEST
 * Status: AC
 * My Solution: https://www.codechef.com/viewsolution/18625907
 * Difficulty Level: Beginner
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Codechef_INTEST
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the value of n and k");
		String input[] = in.readLine().split(" ");
		long n = Long.parseLong(input[0]);
		long k = Long.parseLong(input[1]);
		long num;
		int count=0;
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter a number");
			num = Integer.parseInt(in.readLine());
			if(num%k==0)
				count++;
		}
		System.out.println(count);
	}
}
