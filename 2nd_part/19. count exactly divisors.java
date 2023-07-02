//Write a program to count Number of integers which has exactly X divisors using Java
import java.util.*;
 
class Main{
    public static void main(String[] args)
    {
        int  n = 14, x = 2 ;
        int count = 0;
    
        for(int i=1; i<=n; i++){
        
            //variable to count the factors of i-th number
            int count_factors = 0;
            for(int j = 1; j<= i; j++){
                if(i%j==0){
                    count_factors++;
                }
            }
        
            if(count_factors == x){
                System.out.print(count_factors);
                count++;
            }
        }       
        System.out.println("\ncount is " + count);
    }
}

// Output is
// 222222
// count is 6
