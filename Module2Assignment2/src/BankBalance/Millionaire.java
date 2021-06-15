/**************************************************
 * Module 2
 * Assignment 2
 * By Karolina Szulczyk
 * 
 ***************************************************/

package BankBalance;

import java.util.Scanner;
public class Millionaire 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter starting balance");
		int balance = input.nextInt();
		boolean isFirstConditionmet = false;
		int years = 0;
		while (balance <= 1000000)
		{
			balance += balance;
			years += 1;
			if (balance >= 100000 && isFirstConditionmet == false)
			{
				isFirstConditionmet = true;
				System.out.println("It takes " + years + " years to reach $100,000");
			}
		}
		System.out.println("It takes" + years + " years to reach $1,000,000");
		input.close();		
	}// end main
}// end Bank Balance
