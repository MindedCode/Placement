****/******************************************************************************

                     Leap year or not 
                method -> 1 : if else 
                method -> 2 : ternary operater

*******************************************************************************/****

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
		System.out.println("Enter the any check year like -> 400, 2036, 1900, 2024, 2028, 2032");
		int year = s.nextInt();
		
		if(year%400 == 0)
		    System.out.println("this year is leap year");
		else if(year%4 == 0 && year%100 != 0)
		    System.out.println("The year is leap year");
		else 
		    System.out.println("the year is not a leap year");
		    
		    //Function calls
		leap(year);
		ternary(year);
		ternary2(year);
	}
	
	// --------------- using only if else statement 
	
	static void leap(int y){
	    if(y%400 == 0 || (y%4 == 0 && y%100 != 0))
	        System.out.println("leap year");
	    else System.out.println("not leap year");
	}
	
	// ------------------using ternary operater
	
	static void ternary(int yr){
	    String result = yr%400 == 0 || (yr%4 == 0 && yr%100 != 0) ? "yes" : "No";
	    System.out.println(result);
	}
	
	// ---------------------using ternary 2nd
	
	static void ternary2(int year){
	    int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
        if (flag ==1)
        {
            System.out.println (year + " is a Leap Year");
        }
        else
        {
             System.out.println (year + " is not a Leap Year");
        }
    }
	
}


**/Output of the program /**
Enter the any check year like -> 400, 2036, 1900, 2024, 2028, 2032
1900
the year is not a leap year
not leap year
No
1900 is not a Leap Year
