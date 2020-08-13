package com.pk.arrayLogic;

import java.util.Scanner;

public class SearchElement
{
	public static void main(String[] args) {
		int a[]= {10,56,25,48,99};
		int flag=0;
		System.out.println("Enter elememts to search:");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("found");
		else
			System.out.println("not found");
	}
}
