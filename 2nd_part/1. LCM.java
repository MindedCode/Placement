/******************************************************************************

                            Method 1: A linear way to calculate LCM
                            Method 2: Modified interval Linear way
                            Method 3: Simple usage of HCF calculation to determine LCM
                            Method 4: Repeated subtraction to calculate HCF and determine LCM
                            Method 5: Recursive repeated subtraction to calculate HCF and determine LCM
                            Method 6: Modulo Recursive repeated subtraction to calculate HCF and determine LCM

*******************************************************************************/


// Method 1: A linear way to calculate LCM=============================================
public class Main{
    public static void lcm1(int n1, int n2){
    int lcm = 0;
    
    // finding the larger number here
    int max = (n1 > n2) ? n1 : n2;

    for(int i = max; i <= n1 * n2; i++){
        if (i % n1 == 0 && i % n2 == 0){
            lcm = i;
            break;
        }
    }
    System.out.println("The LCM: " + lcm); return;
}
	public static void main(String[] args) {
    	int n1 = 36, n2 = 60;
        lcm1(n1, n2);
	}
}




// Method 2: Modified interval Linear way -----------------------------------------------------
public class Main{
    public static void lcm1(int n1, int n2){
    int lcm = 0;
    
    // finding the larger number here
    int max = (n1 > n2) ? n1 : n2;

    for(int i = max; i <= n1 * n2; i = i + max){
        if (i % n1 == 0 && i % n2 == 0){
            lcm = i;
            break;
        }
    }
    System.out.println("The LCM: " + lcm); return;
}
	public static void main(String[] args) {
    	int n1 = 36, n2 = 60;
        lcm1(n1, n2);
	}
}

// Method 3: Simple usage of HCF calculation to determine LCM------------------------------------------
public class Main{
    
    public static void lcm3(int n1, int n2){
        int hcf =1; int lcm = 0;

        for (int i = 1; i <= n1 || i <= n2; i++){
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
    
            // LCM formula
            lcm = (n1 * n2) / hcf; 
        }
        System.out.println ("The LCM: " + lcm);
    }

	public static void main(String[] args) {
    	int n1 = 36, n2 = 60;
        lcm3(n1, n2);
	}
}

// Output:
// 180

// Method 4: Repeated subtraction to calculate HCF and determine LCM (Using Recursion) -----------------------------------------------
public class Main
{
  public static void main (String[]args)
  {
    int n1 = 144, n2 = 32;

    int hcf = getHCF (n1, n2);
      System.out.println ("The HCF: " + hcf);

    // LCM formula
    int lcm = (n1 * n2) / hcf;
      System.out.println ("The LCM: " + lcm);
  }

  static int getHCF (int n1, int n2)
  {

    // using repeated subtraction here
    while (n1 != n2)
      {
     if (n1 > n2)
        n1 -= n2;
     else
        n2 -= n1;
      }

    return n1;
  }
}


// Output is :
	// The HCF: 16
	// The LCM: 288


// Method 5: Recursive repeated subtraction to calculate HCF and determine LCM--------------------------------------
public class Main
{
  public static void main (String[]args)
  {
    int n1 = 144, n2 = 32;

    int hcf = getHCF (n1, n2);
      System.out.println ("The HCF: " + hcf);

    // LCM formula
    int lcm = (n1 * n2) / hcf;
      System.out.println ("The LCM: " + lcm);
  }

  // Recursive function for repeated subtraction HCF calculation
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

// Output of the program:
	// The HCF: 16
	// The LCM: 288


// ------------------------------------- using eucledeian solution 
public class Main
{
  public static void main (String[]args)
  {
    int num1 = 144, num2 = 32;

    int hcf = getHCF (num1, num2);
      System.out.println ("The HCF: " + hcf);

    // LCM formula
    int lcm = (num1 * num2) / hcf;
      System.out.println ("The LCM: " + lcm);
  }

// This method improves complexity of repeated substraction
// By efficient use of modulo operator in euclidean algorithm
  static int getHCF (int a, int b)
  {
    return b == 0 ? a : getHCF (b, a % b);
  }
}


