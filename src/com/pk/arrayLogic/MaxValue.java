package com.pk.arrayLogic;

public class MaxValue
{

	public static void main(String[] args) {
		int a[]= {23,45,7,500};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max:"+max);
	}
}
