/******************************************************************************

                            Fibnacci series 
                            1 - Iteration
                            2 - Recursion
                            3 - Array and formula

*******************************************************************************/

public class Main
{   static int a = 0, b = 1, next;
    public static int printFibR(int n){
        if(n>0){
       
		    next = a+b;
		    a = b;
		    b = next;
		    
		    System.out.print(next + " ");
		    printFibR(n-1);
		    
		}
		return 0;
    }
    public static void printFib(int n){
        int x = 0, y = 1, z;
        System.out.print(x + " " + y + " ");
        for(int i=2; i<n; i++){
		    z = x+y;
		    x = y;
		    y = z;
		    
		    System.out.print(z + " ");
		    
		}
// 		return 0;
    }
    public static void FibArr(int n){
        // int x = 0, y = 1, z;
        // System.out.print(x+" "+b+" ");
        
        int f[] = new int [n+1];
        
        f[0] = 0;
        f[1] = 1;
        
        System.out.print(f[0] + " " + f[1] + " ");
        
        for(int i=2; i<n; i++){
            f[i] = f[i-1] + f[i-2];
            System.out.print(f[i] + " ");
        }
    }
	public static void main(String[] args) {
		int n = 15;
		System.out.println("Iteration through : ");
		printFib(n);
		
		System.out.println("\n\nRecursion through : ");
		System.out.print(a + " " + b + " ");
		printFibR(n-2);
		System.out.println("\n\nusing Formula and array  : ");
		FibArr(n);
		
	}
	
}


"Output of the program""
  Iteration through : 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 

Recursion through : 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 

using Formula and array  : 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
