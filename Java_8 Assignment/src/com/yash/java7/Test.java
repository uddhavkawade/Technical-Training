package com.yash.java7;

public class Test {
    
    public static void main(String[] args) {

       Result r = new Result();
        Calculate c;
        double d = 0;
        c = r.emiCalculation();

       d = r.input(c, 1200, 10, 12, 1);

       System.out.println(d);
   }

}