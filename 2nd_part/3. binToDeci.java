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
	}
}


// Output of the Program:
// 23


//Java program to convert octal number to decimal number----------------------------------------------

public class Main
{
    static void octal1(int octal){
        //Declare variable to store decimal number  
        int decimal = 0;
		//Declare variable to use in power		
		int p = 0;  
		//writing logic for the conversion
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, p);  
			octal = octal/10;  
			p++;  
		}
		//printing result
		System.out.println("Decimal number : "+decimal);
    }
	public static void main(String args[])
	{      
		int octal = 37;
		octal1(octal);
	}
}

// Output of the Program:
// 31



//Java program to convert Hexa Decimal number to decimal number

public class Main
{
    static void hexa1(int hexa){
        //Declare variable to store decimal number  
        int HexaDecimal = 0;
		//Declare variable to use in power		
		int p = 0;  
		//writing logic for the conversion
		while(hexa > 0)
		{
			int temp = hexa % 10;  
			HexaDecimal += temp * Math.pow(16, p);  
			hexa = hexa/10;  
			p++;  
		}
		//printing result
		System.out.println("Hexa Decimal number : "+HexaDecimal);
    }
	public static void main(String args[])
	{      
		int hexaNum = 99;
		hexa1(hexaNum);
	}
}

// Output of the Program:
// 153
