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
	        reverseRecursionI(number,reverse);
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
	    
	    if(n==0){
	        return r;
	    }
	    System.out.println( "1....."+r);
	    r = r * 10 + n%10;
	    n/=10;
	    System.out.println( "\n2....."+r);
	    
	    return reverseRecursionI(n, r);
	    
	}
}





****/Output of the Program : /****
Enter the any number choice reverse :
12345464 
After reverse number 46454321

After reverse number help of for loop  : 46454321
1.....0

2.....4
1.....4

2.....46
1.....46

2.....464
1.....464

2.....4645
1.....4645

2.....46454
1.....46454

2.....464543
1.....464543

2.....4645432
1.....4645432

2.....46454321
