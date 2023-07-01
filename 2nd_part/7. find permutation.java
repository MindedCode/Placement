
/*
                find all possible permutations in which n people can occupy r seats in a theater
                npr = n! / (n-r)!
  */
import java.util.*;  
//import java.io.*;

public class Main
    {  
      public static void main(String[] args)  
        {  

            int n = 5, r = 2, per, fact1, fact2;  


            fact1 = 1;  

            for (int i = n; i > 1; i=i-1)  
            {  
                fact1 = fact1 * i;  //calculating factorial (n!)
            }   
            System.out.println("Fact1 " + fact1);

            int number;  

            number = n - r;  
            System.out.println("Number " + number);

            fact2 = 1;  

            for (int i = number; i > 1; i=i-1)  
            {  
                fact2 = fact2 * i;  //calculating factorial ((n-r)!)
            }  
            
            System.out.println("Fact2 " + fact2);
            
            // System.out.println("Fact3 " + per = fact1 / fact2);

            per = fact1 / fact2;  //calculating  nPr

            System.out.println(per+" ways");  
    }  
}



// Output :

// Fact1 120
// Number 3
// Fact2 6
// 20 ways
