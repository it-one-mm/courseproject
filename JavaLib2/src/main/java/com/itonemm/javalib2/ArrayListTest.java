package com.itonemm.javalib2;


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[]args)
    {

        ArrayList<User> myusers=new ArrayList<User>();

        User user1=new User();
        user1.userid=1;
        user1.username="Mg Mg";

        myusers.add(user1);
        myusers.add(new User(2,"Hsu Hsu"));

        myusers.add(new User(3,"Hello"));

        for(User temp:myusers)
        {
            System.out.println("User  id :"+temp.userid);
            System.out.println("User name:"+temp.username);
        }
    }

}
