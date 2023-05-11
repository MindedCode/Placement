/*
            Find the positive and negative number of powers
            method 1 - without loop
            method 2 - with loop
            
*/
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Math. pow(double a, double b) returns the value of a raised to the power of b . 
        It's a static method on Math class, which means you don't have to instantiate a Math instance to call it.
        */
        System.out.println("Enter the base :");
        double base = sc.nextDouble();
        System.out.println("Enter the positive :");
        double first = sc.nextDouble();
        System.out.println("Enter the negative :");
        double second = sc.nextDouble();
        System.out.println("Enter the positive integer :");
        int expo = sc.nextInt();
        double res1 = 13, res2 = 0;
        power(base, first, second, res1, res2);
        power1(base, expo, res1);
        // System.out.println(power2(base, expo));
        
        
    }
    
    static void power(double base, double a, double b, double r1, double r2){
            r1 = Math.pow(base, a);
            r2 = Math.pow(base, b);
            
            System.out.println("First Result => " + r1 + "\nSecond Result => " + r2);
    }
    
    // Works only when exponent is positive integer
    static void power1(double base, int expo, double r1){
            while(expo!=0){
                r1=r1*base;
                expo--;
            }
            
            System.out.println("Withloop Result => " + r1);
    }
    
    // static double power2(double base, int expo){
    //     if(expo==0){
    //         // System.out.println("Recursion Result => " + r1);
    //         return 0.0;
    //     }
    //     // r1 = r1 * base;
    //     // System.out.println("hhh"+r1);
    //     // return power2(base, expo--, r1);
    //     expo--;
    //     return base * power2(base, expo);
    // }
}



Output of the program:

Enter the base :
3.3
Enter the positive :
3.3
Enter the negative :
-3.4
Enter the positive integer :

5
First Result => 51.415729444066585
Second Result => 0.017260469487370297
Withloop Result => 5087.601089999998
