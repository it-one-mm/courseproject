package com.itonemm.javalib;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {
    public static void main(String[]args)
    {
       int number1=1;
       int number2=2;
       int res=number1+number2;
       int a=11; // a=1
       int b=10* ++a; //
        System.out.println("B is a pre increment:"+b);
        System.out.println(" The Value of a:"+a);
        b=10*a++;

        System.out.println("B is a post increment:"+b);

        System.out.println(" The Value of a:"+a);
       System.out.println("B is :"+b);

      double x= (a>b)? a/10.0:b;


        System.out.println("X is:"+x);

        b+=1; // b=b+1;
        System.out.println("B is :"+b);
        System.out.println("Result is:"+res);
        System.out.println("Remainder is : "+a);
    }

}
