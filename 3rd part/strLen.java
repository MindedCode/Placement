public class Main
{
     //Function to calculate length
    private static int strLength(String str)
    {
        // if we reach at the end of the string
        if (str.equals(""))
            return 0;
        else
            return strLength(str.substring(1)) + 1;
    }

    //Driver program to test the function 
    public static void main(String[] args)
    {
        String str ="Minded code";
        System.out.println("length of the string "+strLength(str));
    }
}



// Output
// length is 11 




// using loop:
  class Main {
    public
    static void main(String args[]) {
        int i = 0;
        String str = "Prepinsta";
        char ch[] = str.toCharArray();
        for (char c : ch) {
            i++;
        }
        System.out.println("Length of the string = "+ i);
    }
}
