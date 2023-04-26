/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner p = new Scanner(System.in);

	    System.out.println("Enter the any number and then check prime or not");
	    int n = p.nextInt();
	    
	    int i = 1;
	    int count = 0;
	    while(i<=n){
	        if(n%i == 0){
	            count++;
	        }
	        i++;
	    }
	    if(count==2)
		    System.out.println("The number is Prime");
		else System.out.println("The number is not Prime");
		
// 		function calls
        prime1(n);
        prime2(n);
        prime3(n);
 
        System.out.println(prime4(n));
        int i1 = 2;
        boolean isprime= true;
    
        isprime=primeRecursion(n, i1);
    
        String result = isprime ? "Prime":"not Prime";
        System.out.println(n + " is : "+ result); 
        // System.out.println(primeRecursion(n));

	}
	
	static void prime1(int p){
	    
	    boolean isPrime = true;

    	if (p < 2)
            isPrime = false;
        else{
            int i = 2;
        	    
        	while(i<p){ // "<=" no use because enter ho jayega isme loop me
        	     
        	    if(p%i==0){
        	        isPrime = false;
        	        break;
        	    }
        	    i++;
            }
        }
    	String outcome = isPrime ? "yes prime" : "Not prime";
    	System.out.println(outcome + "");
	}
	
	/*
	This program is better than privious version
	Time Complexity : o(n)
	sp Complexity: o(1)
	becouse loops b/w [2, n-1] rather than [1, n]
	*/
	
	
	static void prime2(int p){
	    
	    boolean isPrime = true;

    	if (p < 2)
            isPrime = false;
        else{
            int i = 2;
        	while(i<=p/2){  // here "<", "<=" both use because n time loop is not run
        	    
        	    if(p%i==0){
        	        isPrime = false;
        	        break;
        	    }
        	    i++;
            }
        }
    	int result = isPrime ? 1 : 0;
    	System.out.println(result);
	}
	
	/*
	This program is better than privious version
	Time Complexity : o(n)
	sp Complexity: o(1)
	becouse loops b/w [2, n/2] rather than [2, n-1]
	*/
	
	
	static void prime3(int p){
	    
	    boolean isPrime = true;

    	if (p < 2)
            isPrime = false;
        else{
            int i = 2;
        	while(i<=Math.sqrt(p)){  // here "<", "<=" both use because n time loop is not run
        	    
        	    if(p%i==0){
        	        isPrime = false;
        	        break;
        	    }
        	    i++;
            }
        }
    	int result = isPrime ? 1 : 0;
    	System.out.println(result);
	}
	
	
	// Time Complexity : O(N)
     // Space Complexity : O(1)
     // This program is better than previous version as :
     // Loops runs b/w [2, sqrt root(n)] rather than [2, n/2]
     
     
    static boolean prime4(int primeN){
         
	   if(primeN <= 1)
	       return false;
	   else if(primeN == 2)
	       return true;
	   else if(primeN % 2 == 0)
	       return false;
	   int i = 3;
	   while(i <= Math.sqrt(primeN)){
	        if(primeN % i == 0)
	           return false;
	           i += 2;
	    }
	    return true;
     }
     
    static boolean primeRecursion(int number, int i){
        if (number < 2)
        return false;

    // if this satisfies then its prime as we
    // have completed recursion from 2 to n
    // int i = 2;
    if (i == number)
        return true;

    // Base cases
    if (number % i == 0)
        return false;

    i += 1;
    return primeRecursion(number, i);
    }
}


***/Output of the Program/****

Enter the any number and then check prime or not
5
The number is Prime
yes prime
1
1
true
5 is : Prime



