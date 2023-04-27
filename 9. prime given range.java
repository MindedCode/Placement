/******************************************************************************

Prime numbers in a given range
*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter the any number till display the all prime Numbers except only - n>2 ");
	    
	    int n = sc.nextInt();
	    int i, j, temp;
	    
	    for(i=2; i<=n; i++){
	            
	        temp = 1;
	        for(j = 2; j<=i/2; j++)
	        {
	            if(i%j == 0){
	                temp=0;
	                break;
                }
	        }
	        if(temp == 1)
	            System.out.println(i);
	    }
	    System.out.printf("\n\nSecond function -\n");
	    prime(n);
 	}
 	
 	
 	// using defined function
 	
 	public static void prime (int n) {
 	    
	    for(int i=2; i<=n; i++){
	        if(isprime(i))
	            System.out.println(i);
	    }
	}
	
	static boolean isprime(int n){
	    
	    for(int i=2; i<n; i++){ // jarui opetator "<" neither "<=" no excute code
	        if(n%i == 0)        // if (i<n/2) then out prime number "4" num bhi prime hoga 
	            return false;
	    }return true;
	}
}


?? Output of the Program:

Enter the any number till display the all prime Numbers except only - n>2 20
2
3
5
7
11
13
17
19

  
Second function -
2
3
5
7
11
13
17
19


