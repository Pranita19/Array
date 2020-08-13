package com.pk.arrayLogic;

import java.util.Scanner;

public class AvgOfArray
{

	public static void main(String[] args) {
		int a[]= new int[3];
		int sum=0,avg=0;
		System.out.println("Enter elements:");

		for(int i=0;i<a.length;i++)
		{
			a[i]=new Scanner(System.in).nextInt();
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("avg:"+avg);
		
	}
}
