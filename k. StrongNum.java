/******************************************************************************

            Strong Number   1, 2, 145, 40585
            Method 1: Using Simple Iteration
            Method 2: Using Recursive Function
            Smart Dynamic Programming Approach / using array 

*******************************************************************************/
public class Main
{
    /*
    Smart Dynamic Programming Approach / using array ----------------------------------------
    */
    static int DpFact(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) 
            dp[i] = i * dp[i - 1];
            return dp[n];
    }
    /*
    Recursive Function Approach / using array ----------------------------------------
    */
    static int factR(int n){
        
        if(n == 0)
        return 1;
        return n * factR(n-1);
    }
    static int fact(int n){
	    int sum = 1;
	    for(int i=1; i<=n; i++)
	        sum *= i;
	    return sum;
	}
    static void __strongN(int n){
        
        int sum = 0, sum1 = 0, temp = n;
        
        // check the strong Number
        while(temp!=0){
            sum += factR(temp%10);
            sum1 += DpFact(temp%10);
            temp/=10;
        }
        
        if(temp == n)
            System.out.println(n + " is Strong Number ");
        else System.out.println(n + " is Strong Number ");
        System.out.println("DP result : " + sum1);
    }
    
    /*
    using boolean Function -----------------------------------------------
    */
    static boolean detectStrong(int n){
        int sum=0, temp=n; 
        boolean flag = false;
        while(n!=0){
          sum += fact(n%10);
          n/=10;
        }
        System.out.println("DP result : " + sum);
        if(temp == sum)
        flag = true;
        else flag = false;
        return flag;
    }

	static void _strongN(int n){
	    int temp = n, sum = 0;
	    while(n!=0){
	        int digit = n%10;
	        sum += fact(digit);
	        n/=10;
	    }
	    if(temp == sum)
		    System.out.println("Yes " + sum + " Strong Number"); 
		else System.out.println(sum + " No");
	}
	
	public static void main(String[] args) {
		
		_strongN(145);
		__strongN(145);
		
		if(detectStrong(145))
        System.out.println("Yes");
        else System.out.println("No");
	}
}



*****//*****Output of the pro
Yes 145 Strong Number
145 is Strong Number 
DP result : 145
DP result : 145
Yes
****//****


