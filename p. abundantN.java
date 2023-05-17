/******************************************************************************

                            Abundant Number or not
                            
                            2, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100, 102, 104, 108, 112, 114, 120

*******************************************************************************/

public class Main
{
    static void _AbundantN(int n){
        int result = 0, temp = n;
        
        for(int i=1; i< Math.sqrt(n); i++){
            if(n%i == 0){
                if(i == 1)
                result+=i;
                else if(i==n/i)
                result+=i;
                else result += i+n/i;
            }
        }
        if(result > temp)
        System.out.println(result + " Yes " + "abundance Number is " + (result - n));
        else System.out.println(result + " No " + "abundance Number is " + (result - n) );
    }
    static int abundantN(int n){
        int result =0;
        for(int i =1; i<n; i++){
            if(n%i == 0)
            result = result + i;
        }
        return result;
    }
	public static void main(String[] args) {
	    int n = 20;
		
		if(abundantN(n) > n)
		    System.out.println( n + " Yes " + (abundantN(n) - n));
		else System.out.println(n + "No" + (abundantN(n) - n));
		
		_AbundantN(n);
	}
}


Output of the program:

20 Yes 2
22 Yes abundance Number is 2
