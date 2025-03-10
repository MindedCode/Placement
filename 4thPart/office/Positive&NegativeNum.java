// import java.text.ListFormat.Style;
import java.util.Scanner;

public class Jadoo{

    public static void oNeven(int a){
        // int a=4;
        if(a==0 || a<0) System.out.println("This number is zero or negative");
        else if(a%2==1) System.out.println("This is Odd Number"); 
        else if (a%2==0) System.out.println("This is Even Number");
        // else System.out.println("This is Even Number");
        // else 
    }
    public static void main(String [] aa){
        System.out.println("This Jadoo Program...!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int a = sc.nextInt();
        oNeven(a);
        // sc.exit();
        System.exit(a);
    }
}


// This Jadoo Program...!
// Please Enter a Number
// 9
// This is Odd Number

// Output is here: 
