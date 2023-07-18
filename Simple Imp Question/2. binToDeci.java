
 
/**
 * Binary to Decimal conversion using Recursion.
 */
public class BinaryToDecimalRecursion {
 
    // recursive method for binary to decimal
    public static int binaryToDecimal(int binary) {
 
        // if binary number become 0
        if (binary == 0) {
            return 0;
        }
 
        return (binary % 10 + 2 * binaryToDecimal(binary / 10));
    }
 
    // main method to test
    public static void main(String[] args) {
 
        // Binary number is in integer format
        System.out.println("Decimal Number of 1001 is: " + binaryToDecimal(1001));
        System.out.println("Decimal Number of 1111 is: " + binaryToDecimal(1111));
        System.out.println("Decimal Number of 1100110 is: " + binaryToDecimal(1100110));
        System.out.println("Decimal Number of 1000000001 is: " + binaryToDecimal(1000000001));
    }
 
}
