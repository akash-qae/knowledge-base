/*
 * Date: 05/20/2018
 * Problem Statement Link: https://www.codechef.com/problems/HS08TEST
 * Status: AC
 * My Solution: https://www.codechef.com/viewsolution/18604984
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

		System.out.println(df.format(getAccountBalance(withdraw, balance, transactionCharges)));
	}
	
	public static double getAccountBalance(int withdraw, double balance, double transactionCharges)
	{
		if(withdraw%5==0 && withdraw+transactionCharges<=balance)
			return balance-(withdraw+transactionCharges);
		else
			return balance;
	}
}
