public class Main
{
    // Recursive function to return gcd of a and b
    static int gcd(int num1, int num2)
    {
        // Everything divides 0
        if (num1 == 0)
          return num2;
          
        if (num2 == 0)
          return num1;

        // base case
        if (num1 == num2)
            return num1;
            
        // a is greater
        if (num1 > num2)
            return gcd(num1-num2, num2);
        return gcd(num1, num2-num1);
    }
    // Driver method
    public static void main(String[] args)
    {
        int num1 = 98, num2 = 56;
        System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd(num1, num2));
    }
}
Output

HCF of 96 and 56 is 8
