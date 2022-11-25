package com.yash.basic;

public class MultipleExceptionExample{    
    public static void main(String args[]){    
        try{   
        	int a=10;
        	int b=0;
        	int c;
        	c=a/b;
            int array[] = new int[10];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  
            System.out.println(e.getMessage());  
        }    
     }    
}  
