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

class Main
{
  public static void main (String[]args)
  {

    String hex = "A9";
    System.out.println (convert (hex));
  }
  
  static int convert(String hex){  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             }  
             return val;  
  }  

}

// Output of the Program:
// 153
