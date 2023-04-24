/******************************************************************************

----------------------------------Sum of numbers in a given range

*method:1 loop
*method:2 using formula
* method:3 using recursion

*******************************************************************************/

//````````````````````````````using formula``````````````````````````````````````

// public class Main
// {
// 	public static void main(String[] args) {
// 	    int first_n = 16;
// 	    int last_n = 17;
	    
// 	    int result = last_n*(last_n+1)/2-first_n*(first_n+1)/2+first_n;
// 	    System.out.println(result);
// 	}
	
// }

// `````````````````````````````````using recursion```````````````````````````````````

// public class Main{
//     public static void main(String []s){
        
//         int x=5;
//         int y=6;
        
//         System.out.println(getSum(0,x,y));
//     }
//     static int getSum(int sum, int i, int b){
        
//         // stop when any recursion call tries to go over b (larger number)
//         if(i>b)
//             return sum;
//             sum+=i;
//         return getSum(sum,i+1,b);
//     }
// }

// method 2-----------
public class Main{
    public static void main(String []s){
        
        int x=5;
        int y=6;
        
        System.out.println(getSum(0,x,y));
    }
    static int getSum(int sum, int i, int b){
        
        // stop when any recursion call tries to go over b (larger number)
        if(i>b)
            return sum;
            
        return i+ getSum(sum,i+1,b);
    }
}
