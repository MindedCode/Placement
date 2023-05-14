/******************************************************************************

            Strong Number   1, 2, 145, 40585

*******************************************************************************/
public class Main
{
    static int factR(int n){
        
        if(n == 0)
        return 1;
        return n * factR(n-1);
    }
    static void __strongN(int n){
        
        int sum = 0;
        int temp = n;
        // check the strong Number
        while(temp!=0){
            sum += factR(temp%10);
            temp/=10;
        }
        if(temp == n)
            System.out.println(n + " is Strong Number ");
        else System.out.println(n + " is Strong Number ");
        
    }
    static boolean detectStrong(int n){
        int sum=0, temp=n; 
        boolean flag = false;
        while(n!=0){
          sum += fact(n%10);
          n/=10;
        }
        if(temp == sum)
        flag = true;
        else flag = false;
        return flag;
    }
	static int fact(int n){
	    int sum = 1;
	    for(int i=1; i<=n; i++){
	        sum *= i;
	    }
	    return sum;
	}
	
	static void _strongN(int n){
	    int temp = n;
	    int sum = 0;
	    while(n!=0){
	        int digit = n%10;
	        sum += fact(digit);
	        n/=10;
	    }
	    if(temp == sum){
		    System.out.println("Yes " + sum + " Strong Number"); 
		} else {
		    System.out.println(sum + " No");
		}
	}
	public static void main(String[] args) {
		
		_strongN(145);
		__strongN(145);
		
		if(detectStrong(145))
        System.out.println("Yes");
        else System.out.println("No");
	}
}
