/*    find out the quadrant in which the given co-ordinate lie
// वह चतुर्थांश ज्ञात कीजिए जिसमें दिया गया निर्देशांक स्थित है
                
                // Algo

Get value of x & y
If ( x>0 and y>0 ) First Quadrant
If ( x<0 and y>0 ) Second Quadrant
If ( x<0 and y<0 ) Third Quadrant
If ( x>0 and y>0 ) Fourth Quadrant
If ( x=0 and y=0 ) Origin
If ( x!=0 and y=0 ) x-axis
If ( x>0 and y>0 ) y-axis
  */

import java.io.*;

public class Main
{

    public static void main (String[] args) 
    {

        int x=-3, y=-33;

        //find true condition of first quadrant
        if(x>0 && y>0)
            System.out.println("Quadrant I");   

        //find second quadrant
        else if(x<0 && y>0)
            System.out.println("Quadrant II");

        //To find third quadrant
        else if(x<0 && y<0) System.out.println("Quadrant III"); 

        //To find Fourth quadrant 
        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");
            
        //To find dose not lie on origin
        else if (x == 0 && y == 0)
            System.out.println("Origin");
            
        //On x-axis
        else if (y==0 && x!=0)
            System.out.println("x-axis");
            
        //On y-axis
        else if (x==0 && y!=0)
            System.out.println("y-axis");

    }
}
// Output
// Insert the value for variable X and Y : -3 -33
// point (-3, -33) lies in the Third quadrant
