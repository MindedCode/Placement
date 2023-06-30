import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        HashMap b =new HashMap();
        b.put(0,"000");
        b.put(1,"001");
        b.put(2,"010");
        b.put(3,"011");
        b.put(4,"100");
        b.put(5,"101");
        b.put(6,"110");
        b.put(7,"111");

        String result =" ";
        long num = 347;
        long n=num;
        while(n !=0)
        {
            int rem=0;
            rem=(int)n%10;
            if(n!=0)
            {
                result = b.get(rem)+result;

            }
            n=n/10;

        }
        System.out.println(result);
    }
}


// Output of the Program:

// Declare string type result 
// 011100111 
