package com.yash.basic.opps11;

import java.util.Date;

public class Test
{

	public static void main(String[] args) 
	{
		Date dob = new Date(1996,1, 24);
		Date doj = new Date(2022, 06, 01);
         Employee e = new Employee(101,"Uddhav","Pune", 50000, dob, doj);
         System.out.println(e);
         
         
	}

}
