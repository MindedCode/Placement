/******************************************************************************

                            Friendly pair number or not
                            ° 28), (30, 140), (80, 200), (40, 224), (12, 234), (84, 270), (66, 308)

*******************************************************************************/

public class Main
{
    public static void main (String[]args)
    {

     int num1 = 80, num2 = 200;

     if (getDivisorsSum (num1) / num1 == getDivisorsSum (num2) / num2)
       System.out.println (num1 + " & " + num2 + " are friendly pairs");
     else
         System.out.println (num1 + " & " + num2 + " are not friendly pairs");
    }
    static int getDivisorsSum (int num)
    {

     int sum = 0;

     for (int i = 1; i < num; i++)
       {
 	    if (num % i == 0)
 	    sum = sum + i;
       }
     return sum;
    }
}

// 80 & 200 are friendly pairs
