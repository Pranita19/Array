package com.pk.arrayLogic;

import java.util.Scanner;

public class DescendingOrder 
{

	public static void main(String[] args) {
		int a[]=new int[5];
		// 10,56,45,78,50
		System.out.println("Enter elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Scanner(System.in).nextInt();	
		}
		for(int m=0;m<a.length;m++)
		{
			for(int k=m+1;k<a.length;k++)
			{
				if(a[m]<a[k])
				{
					int temp=a[m];
					a[m]=a[k];
					a[k]=temp;
				}
			}
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}
}
