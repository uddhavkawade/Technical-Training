package com.yash.basic1;

public class MainClass {

	public static void main(String[] args)
	{
       Employee e1 = new Employee();
                e1.InitializePerson();
       Customer c1 = new Customer();
                c1.InitializePerson();
       Department [] arr = new Department[3];
       System.out.println("=====creating array for dept=====");
                     arr[0] = new Department(12344,"Computer Science");
                     arr[1] = new Department(12345,"Hr Department");
                     arr[2] = new Department(12346,"Facility team");
       System.out.println("department data  in department arr 0:");
       arr[0].display();
       
       System.out.println("department data  in department arr 1:");
       arr[1].display();
       
       System.out.println("department data  in department arr 2:");
       arr[2].display();
      // Employee e2 = new Employee();
       
       //print all the details of customer and employee
       System.out.println("-------printing all the details of Customer--------");
       Customer c2 = new Customer(2001,7020711, "pune", "uddhavkawade24@@gmail.com");
       System.out.println(c2);
       System.out.println("-------printing all the details of Employee--------");
       Employee e2 =new Employee();
       e2.setSalary(2333);
       e2.setDate_of_joining(2022);
       e2.setBase_location("Magarpatta");
       e2.setEmailid("yash.com");
       e2.setContactno(232323);
       e2.setDeptobj(arr[1]);
       System.out.println(e2);
       
	}
   
}
