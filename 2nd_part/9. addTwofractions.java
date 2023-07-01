//Java program to add two fractions
public class Main
{
	public static void main(String[] args)
	{
		
		int num1 = 1;
		int den1 = 3;
		int num2 = 3;
		int den2 = 9;
		
		int num, den, x;
		System.out.print("("+num1+" / "+den1+") + ("+num2+" / "+den2+") = ");
		//logic for calculating sum of two fractions
		if(den1 == den2)
		{
			num = num1 + num2 ;
			den = den1 ;
		}
		else{
			num = (num1*den2) + (num2*den1);
			den = den1 * den2;
		}
		if(num > den)
			x = num;
		else
			x = den;
		for(int i = 1 ; i <= x ; i++)
		{
			if(num%i == 0 && den%i == 0)
			{
				num = num/i;
				den = den/i;
			}
		}
		//logic for getting simplified fraction
		int n = 1;
		int p = num;
		int q = den;
		if( num != den)
		{
			while(n != 0)
			{
				//storing remainder
				n = num % den;			
				if(n != 0)
				{
					num = den;
					den = n;
				}
			}			
		}
		System.out.println("("+p/den+" / "+q/den+")");
	}
}


// Output is
// (1 / 3) + (3 / 9) = (2 / 3)
