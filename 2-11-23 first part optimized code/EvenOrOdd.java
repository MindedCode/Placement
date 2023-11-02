


import java.util.*;
public class Main
{
    static String evenOrOdd(int a){
        if(a==0) return "Zero";
        
        String result = (a & 1) == 0 ? "YES" : "NO";
        return result;
        
        
    }
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    System.out.println(evenOrOdd(n));
	}
}






import java.util.*;
public class Main
{
    static String EvenOrOdd(int a){
        if(a==0) return "Zero";
        
        String result = a%2==0 ? "Even" : "Odd";
        return result;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		System.out.println(EvenOrOdd(n));
	}
}
