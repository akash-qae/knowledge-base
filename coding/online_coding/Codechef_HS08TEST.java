/*
 * Date: 05/20/2018
 * Problem Statement Link: https://www.codechef.com/problems/HS08TEST
 * Status: -
 * Difficulty Level: Beginner
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Codechef_HS08TEST 
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception
	{
		double transactionCharges = 0.5;
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);

		//System.out.println("Enter the amount to be withdrawn and the account balance");
		String[] input = in.readLine().split(" ");

		int withdraw = Integer.parseInt(input[0]);
		double balance = Double.parseDouble(input[1]);

		if(withdraw%5==0 && withdraw+transactionCharges<=balance)
			System.out.println(df.format(balance-(withdraw+transactionCharges)));
		else
			System.out.println(df.format(balance));
	}	
}
