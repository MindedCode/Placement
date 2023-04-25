// ******************************************************************
// ``````````````````````````````` greatest of 2 numbers ``````````````````````````````

// method1: 1 using if else if
// method2: 2 using ternary operator
// method3: 3 using inbuilt function check who maximum


import java.util.Scanner;
class Main{
    public static void main(String [] a){
        
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        int x = g.nextInt();
        int y = g.nextInt();
        
        
        if(x==y)
            System.out.println("pair is equal");
        else if(x>y)
            System.out.println(x+" is greater");
        else     System.out.println(y+" is greater");
        
        ternary(x,y);
        inbuilt(x,y);
        
        
        
    }
    
    static void  ternary(int a, int b){
        if(a==b){
            System.out.println("both are equal");
        }
        else{
            String result = a>b ? "a is greater" : "b is greater";
            System.out.println(result);
//              temp = num1 > num2 ? num1 : num2;
// 	            System.out.println (temp + " is largest");
        }
    }
    
     static void  inbuilt(int a, int b){
        if(a==b){
            System.out.println("couple is same"); //couple/ pair
        }
        else
        System.out.println(Math.max(a,b) + " is greater");
    }
}
