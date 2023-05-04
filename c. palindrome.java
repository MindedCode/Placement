//         Palindrome Number or not 
//         Method 1: Using Iteration
//         Method 2: Using Recursion
// *********************************************************************************
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        int number = o.nextInt();
        int reverse = 0;
        int temp = number;

        palindrome(number, reverse, temp);
        System.out.println(palindromeR(number, reverse, temp));

    }

    public static void palindrome(int n, int reverse, int temp) {
        temp = n;
        int digit = 0;
        while (n != 0) {
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (temp == reverse) {
            System.out.println("This number is palindrome : " + reverse); 
        } else
            System.out.println("This number is not Palindrome " + reverse); 
    }

    static int palindromeR(int n, int r, int t) {
        if (n == 0) {
            if (t == r) {
            System.out.print("This number is a palindromeR : " );return r;
            } else
            System.out.print("This number is not palindromeR : ");return r;
            
        }

        r = r * 10 + n % 10;
        n /= 10; 
        
        return palindromeR(n, r, t);
    }
}


Output of the program:
123321
This number is palindrome : 123321
This number is a palindromeR : 123321
  
3356
This number is not Palindrome 6533
This number is not palindromeR : 6533
  
  
  
  
