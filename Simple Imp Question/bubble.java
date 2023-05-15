/******************************************************************************

                            Simple Bubble sort Technique

*******************************************************************************/

public class Main
{
    public static void printA(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void sorting(int a[]){
        for(int i=1; i<a.length; i++){
            for(int j=1; j<a.length-i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
            
    }
	public static void main(String[] args) {
// 		int a[] = new int [a.length];
        int a[] = {1,5,3,4,2};
        
        sorting(a);
        printA(a);
		
	}
}

output of the program:

1 2 3 4 5
