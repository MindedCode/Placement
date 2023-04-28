/******************************************************************************

                            Sum of digits of number

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter the any Number which know sum of digit\n");
	   
	   
	   int number = sc.nextInt();
	   int sum=0;
	   
	   System.out.println("\nUsing Brute force Approach - ");
	   System.out.println("Sum of digit :" + getSum0());  // not allowed void type return type  or function
	   
	   System.out.println("\nUsing Recursion I - ");
	   System.out.println("Sum of digit :" + getSum1(number, sum));
	   
	   System.out.println("\nUsing Recursion II - ");
	   System.out.println("Sum of digit :" + getSum2(number));
	   
	   System.out.println("\nUsing ASCII Table - already exit String this output");
	   System.out.println("Sum of digit :" + getSum3());        // because we can take string 
		
		
	}
	
	-------------------------------------------------------------
	
	static int getSum0(){
	    int n = 125, s=0, digit=0, i=0;
	    
	    while(n>i){       // (num!=10)
	         digit = n%10;
	         s += digit;
	         n /= 10;
	    }
	   // System.out.println(sum);
	    return s;
	}
	
	-----------------------------------------------------------------------
	
	static int getSum1(int num, int sum){
	    
	    if(num==0)
	    return sum;
	    
	    sum += num%10;
	    num /= 10;
	    return getSum1(num, sum);
	}
	
	 
	 -----------------------------------------------------------------------------
	static int getSum2(int num){
	    
	    if(num==0)           /// why write (num>=0)
	    return 0;
	    
	    return (num%10) + getSum2(num/10);
	}
	
	------------------------------------------------------------
	
        /*
        Using ASCII Table 
        
        48 - 0
        49 - 1
        50 - 2
        '  - 3
        '  - 4 
        '  - 5 
        57 - 9 
         
        56 - 48 = 8
        */
	
	static int getSum3(){
	    
	    String num = "8587637627237671763367766734623236565135361289028390813";
	    int sum = 0, i=0;
	    
	    // Traverse through the whole string(char array)
	    while(i<num.length()){
	        // Ascii value pf numbers start from 48
	        // subtracting 48 will give us value in int
	        sum = sum + num.charAt(i) - 48;
	        i++;
	    }
	    return sum;
	    
	}
}
****//Output of the Program ://****
  
// Enter the any Number which know sum of digit
// 123

// Using Brute force Approach - 
// Sum of digit :8

// Using Recursion I - 
// Sum of digit :6

// Using Recursion II - 
// Sum of digit :6

// Using ASCII Table - already exit String this output
// Sum of digit :260
