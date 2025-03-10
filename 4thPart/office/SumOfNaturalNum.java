
// import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class jadoo {
    public static void print(int a) {
        if (a == 0)
            System.out.println("This number is zero");
        // break;
        // System.out.println(a%2 == 0: System.out.println("This is Even number ") ?
        // System.err.println("This is Odd"););
        System.out.println(a % 2 == 0 ? "This is Even number" : "This is Odd");
    }

    public static void addSum(int a){
        int n=0;
        n = (a*(a+1))/2;
        // System.out.println("This Sum of Natural number -> "+ n);
        System.out.println(("This Sum of Natural number -> " + (a*(a+1))/2));
    }

    public static void main(String[] aa) {
        System.out.print("Please Enter a number ");
        Scanner sc = new Scanner(System.in);

        // Scanner.sc = new Scanner(System.in);
        int a = sc.nextInt();

        print(a);
        addSum(a);
    }
}


// Output here:

// Please Enter a number 6
// This is Even number
// This Sum of Natural number -> 21

