package com.pk.array;

import java.util.Scanner;

public class EmpData 
{

	Employee arr[]=new Employee[2];
	
	

	public void setDetails()
	{
		
		for(int i=0;i<arr.length;i++)
		{
		Employee e=new Employee();
		System.out.println("Enter id:");
		e.setEmpId(new Scanner(System.in).nextInt());
		System.out.println("Enter name:");
		e.setName(new Scanner(System.in).next());
		System.out.println("Enter designation:");
		e.setDesignation(new Scanner(System.in).next());
		arr[i]=e;
		}
	}
	
	public void getDetails()
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i].getEmpId());
		System.out.println(arr[i].getName());
		System.out.println(arr[i].getDesignation());	
		}
	}
	public static void main(String[] args)
	{
		EmpData e1=new EmpData();
		e1.setDetails();
		e1.getDetails();
	}
}
