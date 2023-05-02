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
}




****/Output of the Program : /****
Enter the any number choice reverse :
894
After reverse number 498
