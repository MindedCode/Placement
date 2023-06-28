//Java program to convert Binary number to decimal number=-----------------------------------
public class Main
{
	public static void main(String args[])
	{
		int binary = 10111
		//Declaring variable to store decimal number  
		int decimal = 0;
		//Declaring variable to use in power		
		int p = 0;  
		//writing logic for the conversion
		while(binary > 0)
		{
			int t = binary%10; 
			decimal += t*Math.pow(2, p);  
			binary = binary/10;  
			p++;  
		}
		System.out.println("Decimal number : "+decimal); 
                //closing scanner class(not compulsory, but good practice)
		sc.close();
	}
}


// Output of the Program:
// 23
