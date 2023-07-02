//Write a program to print the Occurrence of a Digit in a given Number in Java
import java.io.*;
import java.util.*;

class Main{

    public static void main (String[] args) 

    {
 
        int n = 898989, count = 0;

        int d = 9;

        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        System.out.println(count);

    }

}

// ================================= using  string  and lenght function ============================
class Main{

    public static void main (String[] args) 

    {
 
        int x = 898989, c = 0;

        char b = '9';

        String s = Integer.toString(x);

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==b)
                c=c+1;
        }
        System.out.println(c);

    }

}


// output is
// 3
