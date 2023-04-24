/*
    ---------------------------Find the sum of First N Natural Number-----------------------
    Method :1 loop
    Method :2 formula
    Method :3 recursion
*/


// Loop se??---------------------------------

// class Main{
//     public static void main(String [] s){
//         int n = 5;
//         int i=1;
//         int sum=0;
//         while(i<=5){
//             sum+=i;
//             i++;
//         }
//         System.out.println(sum);
        
//     }    
// }

/////---------using formula-------------------------------

// class Main{
//     public static void main (String[] args) {
//         /* code */
//         int n = 10;
        
//         int result = (n*(n+1))/2;
//         System.out.println(result);
//     }
// }


// using recursion-------------------------------

public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int i=1;
	    int sum = 0;
	    System.out.println(result(i, n, sum));
	    
		
	}
	public static int  result(int i, int n, int sum){
	   
	   if(n==0)
	       return sum;
	   
	   sum = sum + i;
	   i++;
	   n--;
	   return result(i, n, sum);
	}
}
