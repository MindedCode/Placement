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
		System.out.println("Hello World");
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
Hello World
