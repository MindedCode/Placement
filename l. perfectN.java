/*******************************************************************
            Perfect Number 
            method 1 to 5 Time Complexity  o(n) 
            
            Method 1: Using range until num -1 (for loop)
            Method 2: Using range until num -1 (while loop)
            Method 3: In range until num/2
            Method 4: Using range until number/2 and a function
            Method 5: Using Recursion
            Method 6: Using range until √(Number)
                This method uses observations that all factors come in pairs.
                
                Time Complexity: O(√N)
                Space Complexity: O(1)
                
*/

public class Main
 {
     public static void divisorsSum(int n, int sum){
        for(int i=1; i<Math.sqrt(n); i++){
            if(n%i == 0){
                if(i==1)
                sum+=i;
                else if(i==n/i)
                sum+=i;
                else    sum+=i+n/2;
            }
        }
        if (sum == n)
        System.out.println (sum + " is a perfect number ");
        else
        System.out.println (sum + " Is not a perfect number");
     }
     public void recursion(int n, int sum){
         int i = 1;
         if(i<=n/2){
             if(n%i == 0)
                 sum +=i;
             i++;
             recursion(n, sum);
         }
        if (sum == n)
        System.out.println (sum + " is a perfect number ");
        else
        System.out.println (sum + " Is not a perfect number"); 
     }
     
    /*
        all divisors of the numbers (excluding the num itself)
        like 28, half of the num that is  14 will also be the divisor.
        so we can use number/2.
    */
    public static void Ndevide2(int n, int sum){
        int i = 1; 
        while(i<=n/2){                              // very use '=' sign
            if(n%i == 0)
            sum +=i;
            i++;
        }
        if (sum == n)
        System.out.println (sum + " is a perfect number ");
        else
        System.out.println (sum + " Is not a perfect number"); 
    }
    public static void whileL(int n, int sum){
        int i = 1; 
        while(i<n){
            if(n%i == 0)
            sum +=i;
            i++;
        }
        if (sum == n)
        System.out.println (sum + " is a perfect number ");
        else
        System.out.println (sum + " Is not a perfect number");
    }
    public static void forL(int n, int sum){
        for (int i = 1; i < n; i++) {
     	    if (n % i == 0)
 	        sum = sum + i;
        }
        if (sum == n)
        System.out.println (sum + " Is a perfect number");
        else
        System.out.println (sum + " Is not a perfect number");
    }
   public static void main (String[]args)
   {

        int n = 28, sum = 0;

        forL(n, sum);
        System.out.println("\nusing while loop :");
        whileL(n, sum);
        System.out.println("\nnum/2 because 28/ 2 then result  is 14 :");
        Ndevide2(n, sum);
        System.out.println("\nusing Recursive function :");
        Ndevide2(n, sum);
        System.out.println("\nusing Squrt function :");
        divisorsSum(n, sum);
        
   }
 }


****////****Output of the program :
28 Is a perfect number

using while loop :
28 is a perfect number 

num/2 because 28/ 2 then result  is 14 :
28 is a perfect number 

using Recursive function :
28 is a perfect number 

using Squrt function :
35 Is not a perfect number

****////****
