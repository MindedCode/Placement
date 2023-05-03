/******************************************************************************

*   *       *               * Revese Number in java *             *       *   *
                            
                            Method 1: using while loop
                            Method 2: using for loop
                            Method 3: Recursion I
                            Method 4: Recursion II
                            Method 5: Taking care of negative numbers in case of Method 4.
                            
*******************************************************************************/


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner ss = new Scanner(System.in);
	    System.out.println("Enter the any number choice reverse :");
	    int number = ss.nextInt();
	    int reverse = 0;
	    
	    /*
	    Function calls
	        */
	        reverseWhile(number,reverse);
	        reverseForLoop(number,reverse);
	        
	        System.out.println("\nHelp of Recursion I After reversed number : ");
	        reverseRecursionI(number,reverse);
	        
	        System.out.print("\nHelp of Recursion II After reversed number : ");
	        reverseRecursionII(number);         // Single parameter because makes unique Method
	        
	         System.out.print("\nHelp of Recursion II and skip the all negative marks After reversed number : ");   ////  (-*-) = +, so that he"ll be plus.
	        reverseRecursionIII(number);
	        
	}
	
	// 1. Using while loop
	
	static void reverseWhile(int n, int r){
	    
	    int digit=0;
	    while(n!=0){
	        digit = n%10;
	        r = r * 10 + digit;
	        n/=10;
	    }
	    System.out.println("After reverse number " + r);
	}
	
	
	// 2. Help of For loop
	
	static void reverseForLoop(int n,int r){
	    
	   // for(int i=n; i!=0; i/=10){
	   //     r = r * 10 + i%10;
	   // }
	   
	   for( ;n != 0; n/=10)
        {
            r = r * 10 + n % 10;
        }
	    System.out.println("\nAfter reverse number help of for loop  : " + r);
	}
	
	
	// 3. Help of Recursion I
	
	static int reverseRecursionI(int n,int r){
	    
	   // int n = -1234;
    //     boolean isNegative = num < 0 ? true: false;

    //     if (isNegative) {               //  (-*-) = +, so that he plus ho jayega
    //         System.out.print("-");
    //         n = n * -1; 
    //     }
	    
	    if(n==0){
	        return r;
	    }
	    System.out.println( "1....."+r);
	    r = r * 10 + n%10;
	    n/=10;
	    System.out.println( "\n2....."+r);
	    
	    return reverseRecursionI(n, r);
	    
	}
	
	
	// 4. Help of Recursion II
	
	static void reverseRecursionII(int n){
	    int digit=0;
	    if(n==0){
	        
	        return;
	    } 
	    
	    digit = n%10;       // digit = remainder
	    System.out.print(digit);
	    
	    reverseRecursionII(n/10);
	   // System.out.print("After reversed number : ");       //occur very errors thread
	}
	
	
	
	// 3. Taking care of negative Numbers-------------------------------------------------------------------
	
	/*
	The above program will give wrong input if the number is negative, example for -1234 the output will be  -4-3-2-1.

    We can take care of this in the following way –
    
    Check if the number is positive
    Do nothing
    If the number is negative
    Print ‘-‘ additionally and then
    Multiply num with -1 and then send to the function
    */
	
	static void reverseRecursionIII(int n){
	    
	    int rem = 0;
	   // int n = -1234;
        boolean isNegative = n < 0 ? true: false;

        if (isNegative) {               //  (-*-) = +, so that he plus ho jayega
            System.out.print("-");
            n = n * -1; 
        }
	    
	    if(n==0){
	        return;
	    }
	    
	    rem = rem* 10 + n%10;
	    System.out.print(rem);
	    
	    reverseRecursionIII(n/10);
	    
	}
}






****/Output of the Program : /****
Enter the any number choice reverse :
-08748472
After reverse number -2748478

After reverse number help of for loop  : -2748478

Help of Recursion I After reversed number : 
1.....0

2.....-2
1.....-2

2.....-27
1.....-27

2.....-274
1.....-274

2.....-2748
1.....-2748

2.....-27484
1.....-27484

2.....-274847
1.....-274847

2.....-2748478

Help of Recursion II After reversed number : -2-7-4-8-4-7-8
Help of Recursion II and skip the all negative marks After reversed number : -2748478
