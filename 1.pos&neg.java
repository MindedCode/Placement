/*

            """"check of a Integer is Postive of Negative""""

        Method 1 nested if else if
*/

// public class Main
// {
// 	public static void main(String[] args) {
// 	    int n = 0;
	    
// 	    if(n>=0){
// 	        if(n==0)
// 	        System.out.println("The Number is zero");
// 	        else
// 	        System.out.println("The Number is Postive");
// 	    }
// 	    else
// 		System.out.println("The number is -ve ");
// 	}
// }

/*
        Method: 2 using Brute Force solution 
*/
// public class Main{
//     public static void main (String[] args) {
        
//         /* code */
//         int n = 9; //     "01" -> error integer number too large
//         if(n>0){
//             System.out.println("+");
//         }
//         else {
//             if(n<0){
//                 System.out.println("-");
//             }
//             else
//                 System.out.println(0);
//         }
//     }
// }

// public class Main{
//     public static void main(String [] a){
//         int n = 0;
//         if(n>0)
//             System.out.println("+");
//         else if(n>0)
//             System.out.println("-");
//         else 
//             System.out.println("0");
//     }
// }

/*

Method : 3 -> Ternary Operator 
( Condition ) ? ( if True : Action) : ( if False : Action) ;
*/

public class Main{
    public static void main(String a[]){
        int n = -9;
        if(n>0)
            System.out.println("+");
        else{
            String result = n<0 ? "-" : "0";
            System.out.println(result);
        }
    }
}
