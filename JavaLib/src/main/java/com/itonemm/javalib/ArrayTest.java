package com.itonemm.javalib;

public class ArrayTest {
    public static void main(String[]args)
    {
        int arr[];
        arr=new int[10];


        int arr1[]=new int[10];

        arr[0]=8;
        arr[2]=10;
        arr[9]=4;

        for(int i=0;i<arr.length;i++)
        {
           arr[i]=10*i;
        }

        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
       String []arr2=new String[]{"1","2","3"};
        for(int i=0;i<=arr2.length-1;i++)
        {
            System.out.println(arr2[i]);
        }

    }

}
