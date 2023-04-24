/*-----
-------------------------------------Check whether a Number is Odd or Even in java-------------------------------------

Method 1: using Brute force(if else)
Method 2: using ternary operator
Method 3: using Bitwise operator (&, ^)

*/



// ---------------------- Using Bitwise operator---------------------------

// public class Main{
//     public static void main(String [] args){
//         int n = 999;
        
//         if(isOdd(n))
//             System.out.println("The Number is Odd");
//         else
//             System.out.println("The Number is Even");
//     }
//     static boolean isOdd(int n){
//         // return (!(n&1));
//         return ((n & 1) != 0);
//     }
// }

// public class Main{
//     public static void main (String[] args) {
//         /* code */
//         int n = 5555;
//         // if((n&1)==0)
//         if((n & 1) == 1)
//             System.out.println("Odd");
//         else
//         System.out.println("Even");
//     }
// }


import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter a number: ");
      int number = sc.nextInt();
      if((number ^ 1) == number + 1)
         System.out.println(number + " is an even number.");
      
      else
         System.out.println(number + " is an odd number.");
      
   }
}


