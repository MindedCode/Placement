import java.lang.Math;
public class Main
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=100;i++)
		{
		    if(checkPrime(i))
		    {
		        System.out.print(i+" " );
		    }
		}
	}
	public static boolean checkPrime(int num)
	{
	    // 0, 1 and negative numbers are not prime
	    if(num<2)
	    {
	        return false;
	    }
	    else
	    {
	        // A number n is not a prime, if it can be factored into two factors a & b:
            // n = a * b
            /*Now a and b can't be both greater than the square root of n, since
            then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
            So in any factorization of n, at least one of the factors must be
            smaller than the square root of n, and if we can't find any factors
            less than or equal to the square root, n must be a prime.*/
            for(int i=2;i<Math.sqrt(num);i++)
	        {
	            if(num%i==0)
	            {
	                return false;
	            }
	        }
	    }
	    // the number would be prime if we reach here
	    return true;
	}
}

// This method is obviously  faster as has better time complexity


// Checking prime by only checking first √n divisors, but also skipping even iterations.=======================================================================

import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){
		    if(checkPrime(i)){
		        System.out.print(i+" " );
		    }
		}
	}
	public static boolean checkPrime(int n){
	// 0 and 1 are not prime numbers
    // negative numbers are not prime
	    if(n<=1){
	        return false;
	        
	    // special case as 2 is the only even number that is prime
	    }else if(n==2){
	        return true;
	        
	    // Check if n is a multiple of 2 thus all these won't be prime     
	    }else if(n%2==0){
	        return false;
	    }
	    // If not, then just check the odds 
	    for(int i=3;i<Math.sqrt(n);i+=2){
	            if(n%i==0){
	                return false;
	            }
	        }
	    
	    return true;
	}
}

// This method is obviously faster as makes around half lesser comparision due skipping even iterations in the loop



// Output is:

//   2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97




