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
        System.out.println("The HCF is : " + n1);
    }
    static void hcf(int n1, int n2, int hcf){
        for(int i=1; i<=n1||i<=n2; i++){
            if(n1%i == 0 && n2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("The HCF is : " + hcf);
    }
    
	public static void main(String[] args) {
		
		int num1 = 46, num2 = 600, hcf = 0;
		
		hcf(num1, num2, hcf);
		repeated_substruction(num1, num2);
		hcf  = rep_subs_Recursion(num1, num2);
		System.out.println(hcf);
		hcf = getHcf(num1, num2);
		System.out.println(hcf);
		
	}
}



The HCF is : 2
The HCF is : 2
2
2
  
