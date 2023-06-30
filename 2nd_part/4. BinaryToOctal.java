//Java program to convert binary number to octal number

// We will first convert the Binary number into Decimal and then convert the Decimal number into Octal
public class Main
{
	public static void main(String args[])
	{
		int bi = 11111;
		//Declaring variable to store deci number  
		int deci = 0;
		//Declaring variable to use in power		
		int n = 0;  
		//writing logic for the conversion from bi to deci
		while(bi > 0)
		{
			int t = bi%10;  
			deci += t*Math.pow(2, n);  
			bi = bi/10;  
			n++;  
		}
		int octal[] = new int[20];
		int i = 0;
		//writing logic for the conversion from deci to octal
		while(deci > 0)
		{
			int r = deci % 8;
			octal[i++] = r;
			deci = deci / 8;
		}
		//printing result
		System.out.print("Octal number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(octal[j]); 
	}
}


// output of the Program:
// We will first convert the Binary number into Decimal 
// bi = 11111 =>  decimal =31

// and then convert the Decimal number into Octal

// decimal = 31 => octal = 37 
