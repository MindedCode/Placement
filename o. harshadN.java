/******************************************************************************

                            automorphic Number or not
                            
                            What are the harshad numbers from 1 to 1000?
                            
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, 45, 48, 50, 54, 60, 63, 70, 72, 80, 81, 84, 90, 100, 102, 108, 110, 111, 112, 114, 117, 120, 126, 132, 133, 135, 140, 144, 150, 152, 153,

*******************************************************************************/

public class Main
{
    static int harshadN(int n){
        int result =0;
        while(n!=0){
            result = result + n%10;
            n/=10;
        }
        return result;
    }
	public static void main(String[] args) {
	    int n = 20;
		harshadN(n);
		
		if(n%harshadN(n) == 0)
		    System.out.println("Yes");
		else System.out.println("No");
	}
}


output
Yes
