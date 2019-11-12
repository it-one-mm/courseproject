package com.itonemm.javalib;

public class A {

    static int x=0;
    private static  int y=2;
    protected static int z=3;
    public static int a=6;
    int b=9;
    A obj=new A();

    public void add()
    {
        x+=2;
        y+=2;
        z+=3;
        a=+6;
        obj.b=0;


    }

}
