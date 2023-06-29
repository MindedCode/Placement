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






