package com.itonemm.javalib;

public class MethodTest {

    static  int x=5;
    static int y=10;
    public static void main(String []args)
    {
        int x=5;
        int y=10;

        min();
        max(x,y);





    }


    public static void min()
    {
        if(x<y)
        {
            System.out.println("Min is: "+x);
        }
        else {
            System.out.println("Min is:"+y);
        }

    }

    public static void max(int num1,int num2)
    {
        int res;
        if(num1>num2)
        {
            res=num1;
            System.out.println("Max is:"+res);

        }
        else {
            res=num2;
            System.out.println("Max is:"+res);
        }


    }


}
