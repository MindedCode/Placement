/*
**********************************************************************
this all Method is not negative numbers only left Method 5 
        Method 1: Using Range as [ 1, number ] 
        Method 2: Using Range as [ 1, number/2 ]  "i <= (num/2) "
            Time Complexity : O(n) 
            Auxiliary Space : O(1)
        Method 3: Using Range as [ 1,  Sqrt( number )]
            Time Complexity : O(sqrt(N))
            Space Complexity : O(1)
Method 5: For negative numbers  using "Math.abs() function"

**********************************************************************

Take the input of num
Iterate from 1 to num using a for loop as i iterator
Check any given ‘i’ with if it perfectly divides num i.e. num % i == 0

*/public class Main{
    public static void main (String[] args) {
        int num = 10;
        
        factor1(num);
        System.out.println("\n\nnum/2 : ");
        factor2(num);
        System.out.println("\n\nSqrt(num) : ");
        factor3(num);
        System.out.println("\n\nNegative number use Math.abs() function ");
        int negativeInt = -10;
        factor4(negativeInt);
        
    }
    static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n%i == 0)
            System.out.print(i + " ");
        }
    }
    
   
    static void factor2 (int n)
    {
        for(int i = 1; i <= Math.sqrt(n); ++i)
        {
            if (n % i == 0){
                // If both pair of factors are equal then we just print
                // once, example for 100 : (a, b) : (10, 10)
                // 10 should be printed just once
                if(i == n / i)
                    System.out.print(i + ", ");

                    // else print both the pairs
                else
                    System.out.print(i + ", " + n/i + ", ");
            }
        }
    }
    
    static void factor3 (int num)
    {
    int i;
    // to avoid double printing
    boolean flag = false;
    
    for(i = 1; i <= Math.sqrt(num); i++)
    {
        if (num % i == 0)
            System.out.print(i + " ");

        // To avoid double printing of equal pairs 
        // Example (10,10) we only want to print once 
        if(i == num/i) 
            flag = true; 
    } 

    // if flag is true then we had double pairs like (10,10) 
    // we should do i-- so as not to do double printing of pair divisor 
    // doing i -=2 rather than i-- as in previous for loop we exited 
    // with i++, example, i = 10 became 11 and we need to start with 9 
    // so as to ignore 10 as its a double pair 
    if(flag)
        i = i - 2; 

    // printing pairs 
    for(; i >= 1; i--)
    {
        if (num % i == 0)
            System.out.print(num/i + " ");
    } 
  }
  
    static void factor4 (int num)
    {
    for(int i = num; i <= Math.abs(num); ++i){
            // we must skip 0 as iteration
            if(i == 0) 
                continue;
            else {
                if (num % i == 0) 
                    System.out.print(i + " ");
            }
        }
    }
}


***//Output of the Program //***
  
1 2 5 10 

num/2 : 
1, 10, 2, 5, 

Sqrt(num) : 
1 2 5 10 

Negative number use Math.abs() function 
-10 -5 -2 -1 1 2 5 10 
