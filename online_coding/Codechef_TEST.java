/*
 * Date: 05/17/2018
 * Problem Statement Link: https://www.codechef.com/problems/TEST
 * Status: Correct Answer, Execution Time: 0.05
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codechef_TEST 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception
	{
		int n;
		while(true)
		{
			//System.out.println("Enter a number");
			n = Integer.parseInt(in.readLine());
			if(n==42)
				break;
			else
				System.out.println(n);
		}
	}	
}
