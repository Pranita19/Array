package com.pk.arrayLogic;

public class MinValue
{

	public static void main(String[] args) {
		int a[]= {45,12,56,9};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
				if(a[i]<min)
				{
					min=a[i];
				}
		}
		System.out.println("Min:"+min);
	}
}
