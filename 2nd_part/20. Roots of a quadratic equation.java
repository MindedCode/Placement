/* Write a program to find roots of a quadratic equation in Java*/
import java.io.*;
import static java.lang.Math.*;
class Main{
 
    static void findRoots(int a, int b, int c)
    {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }
 
        int d = b * b - 4 * a * c;
        double sqrt_val = sqrt(abs(d));
 
        if (d > 0) {
            System.out.println("Roots are real and different");
            System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n"+ (double)(-b - sqrt_val) / (2 * a));
        }
        else if (d == 0) {
            System.out.println("Roots are real and same ");
            System.out.println(-(double)b / (2 * a) + "\n" + -(double)b / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex");
 
            System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val + "\n" + -(double)b / (2 * a) + " - i" + sqrt_val);
        }
    }
 
    public static void main(String args[])
    {
 
        int a = 1, b = 4, c = 4;
       
        findRoots(a, b, c);
    }
}
