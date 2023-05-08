// **************************************************************
                    // Calculate Factorial
                    
                    /*
                    1 - iterative
                    2 - Recursive */


import java.util.Scanner;

public class Factorial{
    public static void main (String[] args) {
        int n = 0;
        
        calFact(n);
        System.out.println(calFactR(n));
    }
    static void calFact(int n){
        int fact =1;
    for(int i=n; i>1; i--){
        fact*=i;
    }
    System.out.println(fact);
    }
    
    static int calFactR(int n){
    
        if(n==0){
            return 1;
        }
        
        return n * calFactR(n-1);
    }
}



// O/p
1
1
