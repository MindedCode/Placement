/******************************************************************************

            Strong Number   1, 2, 145, 40585

*******************************************************************************/
public class Main
{
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
	
	static int _strongN(int n){
	    int temp = n;
	    int sum = 0;
	    while(n!=0){
	        int digit = n%10;
	        sum += fact(digit);
	        n/=10;
	    }
	    if(temp == sum){
		    System.out.println("Yes Strong Number"); 
		} else {
		    System.out.println("No"); return sum;
		}
	}
	public static void main(String[] args) {
		int num = 145;
		System.out.println(_strongN(num));
// 		__strong(num);
		
		if(detectStrong(145))
        System.out.println("Yes");
        else System.out.println("No");
	}
}
