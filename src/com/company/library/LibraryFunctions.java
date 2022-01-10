package com.company.library;

import java.util.Scanner;

public class LibraryFunctions {
    public static int getInt(String prompt){
        Scanner input = new Scanner(System.in);
        int myNum = -1;
        try {
            myNum = input.nextInt();

        }catch(Exception e){
            System.out.println(e);
        }
        return myNum;
    }
    public static String getString(String prompt){
        Scanner input = new Scanner(System.in);
        String myString = "";
        try {
            myString = input.next();

        }catch(Exception e){
            System.out.println(e);
        }
        return myString;
    }
    public static double getDouble(String prompt){
        Scanner input = new Scanner(System.in);
        double myDouble = -1;
        try {
            myDouble = input.nextInt();

        }catch(Exception e){
            System.out.println(e);
        }
        return myDouble;
    }

}
