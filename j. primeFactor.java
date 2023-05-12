/******************************************************************************

                           PrimeFactor

*******************************************************************************/

// import java.io.*;
// import java.lang.Math;


public class Main
{
	public static void main(String[] args) {
	    
	    int num  = 90;
	    
	    _primeFactor(num);
		System.out.println("\nMethod 2 output  without isprime () function");
		__primeFactor(num);
	}
	
	static void _primeFactor(int n){
	    for(int i=2; i<=n; i++){
	        if(_isprime(i) == 1){
	            int temp = n;
	            while(temp%i ==0){
	                System.out.println(i + " ");
	                temp/=i;
	            }
	            
	        }
	    }
	}
	
	static void __primeFactor(int n){
	    while(n%2==0){
	        System.out.println(2 + " ");
	        n/=2;
	    }
	    for(int i=3; i<=Math.sqrt(n); i+=2){
	        while(n%i == 0){
    	        System.out.println(i + " ");
    	        n/=i;
	        }
	    }
	    if(n>2)
	    System.out.println(n);
	}
	static int _isprime(int n){
	    
	    for(int i=2; i<=Math.sqrt(n); i++){
	        if(n%i == 0)
	        return 0;
	           // System.out.println(0);
	    }
	   // System.out.println(1);
	   return 1;
	}
}



Output of the Program:

2 
3 
3 
5 

Method 2 output  without isprime () function
2 
3 
3 
5
