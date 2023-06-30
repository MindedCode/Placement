/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				
    		Java program to convert decimal number to binary number
       			1. Java program to convert decimal number to octal number
	  `		2. JAVA program to convert decimal to octal number
    			Decimal to Hexadecimal Conversion in Java
       
    
*/



//Java program to convert decimal number to binary number
public class Main
{
	public static void main(String args[])
	{   
		//Decimal Number
		int decimal = 12;
		//integer array for storing binary digits 
		int binary[] = new int[20];
		int i = 0; 
		//writing logic for the conversion 
		while(decimal > 0)
		{       
			int r = decimal % 2;
			binary[i++] = r;
			decimal = decimal/2;
		}
		//printing result
		System.out.print("Binary number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(binary[j]+"");
	}
}






// -------------------------- while ke andder jo value ya counter increase hoga vo loop ke out side bhi reflect 
// 	krega value variable own rule follow krega 
// 	Example: ====
		// //Java program to convert decimal number to binary number
		// public class Main
		// {
		// 	public static void main(String args[])
		// 	{   
		// 		//Decimal Number
		// 		int decimal = 12;
		// 		//integer array for storing binary digits 
		// 		int binary[] = new int[20];
		// 		int i = 0; 
		// 		//writing logic for the conversion 
		// 		while(decimal > 0)
		// 		{       
		// 			int r = decimal % 2;
		// 			binary[i++] = r;
		// 			decimal = decimal/2;
		// 			System.out.println("value of counter (i) " + i);
					
		// 		}
		// 		//printing result
		// 		System.out.print("Value of (i) " + i + "  Binary number : ");
		// 		for(int j = i-1 ; j >= 0 ; j--)
		// 		System.out.print(binary[j]+"");
		// 	}
		// }


                                // Output of the Program:
                                
                                // value of counter (i) 1
                                // value of counter (i) 2
                                // value of counter (i) 3
                                // value of counter (i) 4
                                // Value of (i) 4  Binary number : 1100




//Java program to convert decimal number to octal number------------------------------------------
public class Main
{
	public static void main(String args[])
	{   
		//Decimal Number
		int decimal = 148;
		//integer array for storing octal digits 
		int octal[] = new int[20];
		int i = 0; 
		//writing logic for the conversion 
		while(decimal > 0)
		{       
			int r = decimal % 8;
			octal[i++] = r;
			decimal = decimal/8;
		}
		//printing result
		System.out.print("octal number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(octal[j]+"");
	}
}


Output :

// 224




// JAVA program to convert decimal-------------------------------------------------------------------------
import java.io.*;
public class Main {

    // function to calculate the octal value of the given
    // decimal number
    static void octaltodecimal(int deciNum)
    {

        int octalNum = 0, countval = 1;
        int dNo = deciNum;

        while (deciNum != 0) {

            // decimals remainder is calculated
            int remainder = deciNum % 8;

            // storing the octalvalue
            octalNum += remainder * countval;

            // storing exponential value
            countval = countval * 10;
            deciNum /= 8;
        }
        System.out.println(octalNum);
    }

    // Driver Code
    public static void main(String[] args)
    {

        int n = 33;

        // Function Call
        octaltodecimal(n);
    }
}


// Explanation of output of the Program

// 	int count = 1
// 	octal = 0
// 		condition => while(33!=0)
// 		 remainder = 33%8 = 1
// 		octal = octal(0) + ramin(1) * count(1) = 1
// 		octal = 1
// 		count =  count(1) * 10  => 10
// 		decimal = 33/8 = 4

// 		sout(octal) => 1
// 		===========================

// 		condition => while(4>0)
// 		 remainder = 1%8 = 4
// 		octal = octal(1) + ramin(4) * count(10) = 41
// 		octal = 40
// 		count =  count(10) * 10  => 100
// 		decimal = 34/8 = 0


// 		sout(octal) => 41     
// 		=============================
// 		false condition => while(0!=0)

// ======================================================================
// 		output is 41
		





// Decimal to Hexadecimal Conversion in Java==============================================

public class Main 
{
	public static void main (String[]args) {
		int decimal = 1457;
		convert (decimal);
	} 
	static void convert (int num) {
		// creating a char array to store hexadecimal equivalent
		char[] hexa = new char[100];
	     	// using i to store hexadecimal bit at given array position
	    	int i = 0;
		while (num != 0){
			int rem = 0;
			rem = num % 16;
			// check if rem < 10 : Digits : 0 - 9
	          	// ascii 0 : 48
	        	if (rem < 10){
	        		hexa[i] = (char) (rem + 48);
	           		i++;
	         	}                    
	         	// else positional values : A - F 
			// rem value will be > 10, adding 55 will result : A - F 
			// ascii A : 65, B : 66 ..... F : 70 
			else{    
				hexa[i] = (char) (rem + 55);
				i++;      
			} 
			num = num / 16;
		} 
	// printing hexadecimal array in reverse order
	System.out.println ("Hexadecimal:");   
	for (int j = i - 1; j >= 0; j--)
	System.out.print (hexa[j]);
	} 
} 

// Output of the Program:
// 1457 => 5B1
// 2545 => 9F1
// 1569 => 621



