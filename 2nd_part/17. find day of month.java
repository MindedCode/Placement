/*
                          Method 1: Using if-else ladder.
                          Method 2 : Using Switch Case.
                          Method 3 : Using Array

*/
// Counting number of days in a given month of a year
import java.io.*;
import java.util.*;

class Main{

    public static void main(String args[]){

        int month, year;
        month = 2;
        year = 1996;
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("Number of days is 29");

        else if(month==2)
            System.out.println("Number of days is 28");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");


    }

}


// Output is :
// Number of days is 29

// Method 3 : Using Array===============================================================

import java.io.*;
import java.util.*;

class Main{

    public static void main(String args[]){
        
        int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int month = 12, year=2012;
    
        //For checking leap year
        if(month==2 && ((year%400==0) || ((year%100!=0)&&(year%4==0))))
            System.out.println("Number of days is "+ arr[month-1]+1);
    
        else System.out.println("Number of days is "+arr[month-1]);
            
    }
}


// Output is :
//   Number of days is 31


