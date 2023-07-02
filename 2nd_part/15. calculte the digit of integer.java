
//Java program to find number of digits in an integer
//Java program to find number of digits in an integer
import java.util.Scanner;
class Main{	
public static void main(String[] args)
	{
		int number = 12345;

		//declare a variable to count number of digits
		int digit = 0;
		while(number != 0)
		{
			//pick last digit of the number and count one by one
			int pick_last = number % 10;
			digit++;
			number = number / 10;
		}

		//display number of digits
		System.out.print("Number of Digits = "+digit);

	}
}

// usign Math.log10 function ==> Java program to find number of digits in an integer=========================================
import java.util.*;
 
class Main{	
public static void main(String[] args)
	{
		int number = 12345;
		
		int digit = (int)(Math.log10(number))+1;
		

		//display number of digits
		System.out.println("Number of Digits = "+digit);
		
		System.out.print("Number of Digits = "+Math.log10(number));

	}
}



// Output is :

//   Number of Digits = 5
// Number of Digits = 4.091491094267951
