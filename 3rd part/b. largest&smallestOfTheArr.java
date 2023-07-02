//Largest Element of the array using Recursion in Java
public class Main {
    static int arr[] = {10, 324, 45, 90, 98};
    // Method to find maximum element in arr[]
    static int largest() {
        int i;
        // Initialize maximum element
        int max = arr[0];
        // Traverse array elements from second and compare every element with current max
        for (i = 1; i < arr.length; i++)            
         if (arr[i] > max) max = arr[i];
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());
    }
}


//Largest Element of the array using Recursion in Java
public class Main {
     public static int findMinimum(int A[], int n)
    {
      // if size = 0 means whole array has been traversed
      if(n == 1)
        return A[0];
         
        return Math.min(A[n-1], findMinimum(A, n-1));
    }
     
    public static void main(String args[])
    {
        int A[] = { 15, 60, -6, 0, 2};
        int n = A.length;
        System.out.println("Smallest element in the array is: "+findMinimum(A, n));
    }
}


// Output is:
//     Smallest element in the array is: -6
