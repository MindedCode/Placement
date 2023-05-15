/******************************************************************************

                            Perfect Square

*******************************************************************************/

public class Main
{
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
		
	}
}
