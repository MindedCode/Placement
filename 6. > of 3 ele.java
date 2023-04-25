// ******************************************************************

// ``````````````````````````````` greatest of 3 numbers ``````````````````````````````

// method1: 1 using if else if
// method2: 2 using ternary operator
// method3: 3 using inbuilt function check who maximum

import java.util.Scanner;
class Main{
    public static void main(String [] ar){
        
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int a = g.nextInt();
        int b = g.nextInt();
        int c = g.nextInt();

        if(a==b && b==c)
            System.out.println("equals");
        else if (a >= b && a >= c)
            System.out.println (a + " is the greatest");
        else if (b >= a && b >= c)
            System.out.println (b + " is the greatest");
        else if (c >= a && c >= b)
            System.out.println (c + " is the greatest");
        
        ternary(a,b,c);
        inbuilt(a,b,c);
    }
    
    // `````````````````````using ternary operator```````````````````````````````
    
    static void  ternary(int x, int y, int z){
        if(x!=y && y!=z){
            int temp = x>y ? x:y;
            int greatest = temp>z ? temp:z;
            System.out.println(greatest +" is greatest");
        }
        else System.out.println("all element is Equal");
    }
    
    // `````````````````````using predefined function```````````````````````````````
    
    static void inbuilt(int a, int b, int c){
             
        if(a==b && b==c)
            System.out.println("numbers are equals");
        else{
            int temp = Math.max(Math.max(a,b),c);
            System.out.println(temp + " is greater");
        }
    }
}
