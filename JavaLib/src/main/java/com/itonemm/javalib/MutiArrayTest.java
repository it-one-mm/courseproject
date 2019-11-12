package com.itonemm.javalib;

public class MutiArrayTest {
    public static void main(String[]args)
    {
        int arr[][]=new int[][]{{2,3,4,9,0},{5,6,7},{8,9,10},{8,9,10}};


        for(int i=0;i<arr.length;i++)
        {

                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            System.out.println();
        }


    }


}
