/******************************************************************************

                            automorphic Number or not
                            5, 6, 376

*******************************************************************************/

public class Main
{
    static int automorphic(int n){
        int sr = n*n;
        while(n!=0){
            if(n%10 != sr%10)
                return 0;
            n/=10;
            sr/=10;
        }return 1;
    }
	public static void main(String[] args) {
	    
		if(automorphic(376) == 1)
            System.out.println("Yes");
        else System.out.println("No");
	}
}



output:
Yes
