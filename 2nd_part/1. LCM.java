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
    	int num1 = 36, num2 = 60;
        lcm1(num1, num2);
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
    	int num1 = 36, num2 = 60;
        lcm1(num1, num2);
	}
}




