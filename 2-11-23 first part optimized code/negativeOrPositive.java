
import java.util.*;
public class Main
{
    static String NegativeOrP(int a){
        
        if(a==0) return "zero";
	   
    	   String result = "";
    	   result = a<0?"Negative":"Positive";
    	   return result;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		System.out.println(NegativeOrP(n));
	}
}
