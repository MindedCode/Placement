          // method 1: //Java program to replace all 0's with 1 in a given integer  : 
          // method 2: help of store of arr in element

public class Main
{
	public static void main(String[] args)
	{
		
		int number = 500004;
		//convert the number to string and then calculate its length
		String str = Integer.toString(number);
		int len = str.length();
		String str1 = "";
		//use the logic to replace all 0's with 1 in a given integer
		for(int i = 0 ; i < len ; i++)
		{
			if(str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);	
		}
		System.out.println("Converted number is: "+str1);								
	}
}


// Output :
// Converted number is: 511114

// help of store of arr in element:=====================================================

//Java program to replace all 0's with 1 in a given integer  : 
public class Main
 {
   public static void main (String[]args){
        int count = 1;
        int num = 90601, rem;
        //variables initialization
        int arr[] = new int[20];
        int i=0;
        //loop to find reverse number
        while (num > 0)
        {
     	    rem = num % 10;
     	    if(rem == 0)
     	        rem = 1;
     	    arr[i++] = rem;
     	    num /= 10;
        }
        System.out.print("Converted number is: ");
	    for(int j = i-1 ; j >= 0 ; j--){
            count++;
		    System.out.print(arr[j]);
	    }
   }
 }



// Output of the Program:

// Converted number is: 91611
