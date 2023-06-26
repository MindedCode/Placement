/******************************************************************************

                            find HCF
                                 hcd
                                 
                                 gcd
                                 gcf
                                 gcm
                        method 1 = linear
                        method 2 = repeated_substruction
                        method 3 = rep_subs_Recursion
                        method 4 = Repeated Subtraction with Modulo Operator using Recursion

*******************************************************************************/



public class Main
{
    static int getHcf(int n1, int n2){
        return n2 == 0 ? n1 : getHcf(n2, n1%n2);
    }
    static int rep_subs_Recursion(int n1, int n2){
        if(n1 == 0)
        return n2;
        if(n2 == 0)
        return n2;
        if(n1 == n2)
        return n1; 
        if(n1 > n2)
            return rep_subs_Recursion(n1-n2, n2);
        return rep_subs_Recursion(n1, n2-n1);
    }
    static void repeated_substruction(int n1, int n2){
        while(n1 != n2){
            if(n1>n2)
            n1-=n2;
            else
            n2 -=n1;
        }
	    
        System.out.println("The HCF is : " + n1); 		// n1 ya n2 
    }
	
// 	class Main {
//     public static void main(String[] args) {
//         int n1 = 0, n2 = 60, hcf;

//         while (n1 != 0 && n2 != 0) {
//             if (n1 > n2)
//                 n1 -= n2;
//             else
//                 n2 -= n1;
//         }

//         hcf = (n1 != 0) ? n1 : n2;

//         System.out.println("The HCF: " + hcf);
//     }
// }
    static void hcf(int n1, int n2, int hcf){
        for(int i=1; i<=n1||i<=n2; i++){
            if(n1%i == 0 && n2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("Highest common factor of " + n1 + " and " + n2 + " is => " + hcf);
    }
    
	public static void main(String[] args) {
		
		int n1 = 46, n2 = 600, hcf = 0;
		
		hcf(n1, n2, hcf);
		repeated_substruction(n1, n2);
		hcf  = rep_subs_Recursion(n1, n2);
		System.out.println(hcf);
		hcf = getHcf(n1, n2);
		System.out.println(hcf);
		
	}
}



The HCF is : 2



// Third Method==============================================================================

	class Main
{
  public static void main (String[]args)
  {
    int n1 = 36, n2 = 60, hcf;

      hcf = getHCF (n1, n2);
      System.out.println ("The HCF: " + hcf);
  }

  static int getHCF (int n1, int n2)
  {
    // Handles the case when one of the number is 0 (n1) 
    // Check alert above in explanation
    if (n1 == 0)
      return n2;

    // Handles the case when one of the number is 0 (n2)
    // Check alert above in explanation
    if (n2 == 0)
      return n1;

    // base case
    if (n1 == n2)
      return n1;

    // n1 is greater
    if (n1 > n2)
      return getHCF (n1 - n2, n2);

    return getHCF (n1, n2 - n1);
  }
}
The HCF is : 2
2
2

--------------------------------------------------------------------------------

	class Main
{
    public static void main (String[]args)
    {
        int num1 = 36, num2 = 60, hcf;

            hcf = getHCF (num1, num2);
            System.out.println ("The HCF: " + hcf);
    }

// This method improves complexity of repeated substraction
// By efficient use of modulo operator in euclidean algorithm
    static int getHCF (int a, int b)
    {
        return b == 0 ? a : getHCF (b, a % b);
    }



	// Output of solution::
	               //  // getHCF(60, 36%60)   //36
                // getHCF(36, 60%36)   //24
                // getHCF(24, 36%24)   //12
                // getHCF(12, 24%12)   //0  
	
	// condition is true  return a  => a = 12



	--------------------------------------------------------------------------


	class Main
{
    public static void main (String[]args)
    {
        int num1 = -36, num2 = 60, hcf = 1;

        // if user enters negative number, we just changing it to positive
        // By definition HCF is highest positive number that divides both numbers
        // -144 & 32 : HCF = 16 (as highest num that divides both)
        // -144 & - 32 : HCF = 16 (as highest num that divides both)
            num1 = (num1 > 0) ? num1 : -num1;
            num2 = (num2 > 0) ? num2 : -num2;

            hcf = getHCF (num1, num2);
            System.out.println ("The HCF: " + hcf);
}

// This method improves complexity of repeated substraction
// By efficient use of modulo operator in euclidean algorithm
    static int getHCF (int a, int b)
    {
        return b == 0 ? a : getHCF (b, a % b);
    }
}




  
