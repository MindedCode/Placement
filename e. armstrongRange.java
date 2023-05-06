/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void  printArmstrong(int n, int l,int t){
        int digit = 0, sum = 0;
        
        while(n!=0){
            digit = n%10;
            sum = sum + (int)Math.pow(digit, l);
            n/=10;
        }
        if(t == sum)
        System.out.print(sum + ",");
    }
     public static int printArmstrongR(int n, int l){
        
        if(n==0){
            return 0;
        }
        int digit = n%10;
        
        return (int) Math.pow(digit, l) + printArmstrongR(n/10, l);
    }
    public static int  order(int n){
        int l=0;
        while(n!=0){
            l++;
            n/=10;
        }
        return l;
    }
	public static void main(String[] args) {
	    
		System.out.println("Enter the first range and second");
		Scanner sc = new Scanner(System.in);
		
		int low = sc.nextInt();
		int high = sc.nextInt();
		int temp = 0;
		
		
		for (int num = low; num<=high; num++ ){ 
		    int len = order(num);
    		temp = num;
    		printArmstrong(num, len, temp);
    		
		}
		System.out.println();
		for (int num = low; num<=high; num++ ){ 
    		 int len = order(num);
    		 
    		if(num == printArmstrongR(num, len) )
    		    System.out.print(num + " ");
		}
	}
}



output of the program:

Enter the first range and second
0
100000
0,1,2,3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474,54748,92727,93084,
0 1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474 54748 92727 93084
