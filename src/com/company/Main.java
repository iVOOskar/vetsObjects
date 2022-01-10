package com.company;

import com.company.library.LibraryFunctions;
import com.company.objects.cat;

import java.util.ArrayList;

public class Main {

    static ArrayList<cat> catList = new ArrayList<>();


    public static void main(String[] args) {

        //int myNumber = LibraryFunctions.getInt("please type in a number");

        cat myCat1 = new cat(5, "Bobby", "cat", 5, 3.5, 38, "cat food", "10/01/22");
        cat myCat2 = new cat(6, "Billy", "cat", 6, 3.9, 39, "cat food", "10/01/22");

        System.out.println(myCat1.toString());
        catList.add(myCat1);
        catList.add(myCat2);
        System.out.println(catList.get(1).getName());



    }

}
