/******************************************************************************

                            Perfect Square

*******************************************************************************/

public class Main
{   
    public static void checkPerfectSqr(int n){
        if(Math.ceil((double)Math.sqrt(n)) == Math.floor((double)Math.sqrt(n)))
        System.out.println("True");
        else System.out.println("False");
        
    }
    public static boolean isPerfect(int x){
        if(x>=0){
            int sr = (int)Math.sqrt(x);
            return ((sr*sr) == x);
        }
        return false;
    }
	public static void main(String[] args) {
		int p = 49;
		if(isPerfect(p))
		    System.out.println("True");
		else System.out.println("False");
		checkPerfectSqr(p);
		
	}
}


// Output
True
True
