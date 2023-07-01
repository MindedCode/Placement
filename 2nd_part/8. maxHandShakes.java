/*
          Maximum number of handshakes in Java
          */

public class Main
{
	public static void main(String[] args) {
	     //fill the code
    int num = 8;

    int total = num * (num-1) / 2; // Combination nC2

		System.out.println("For "+ num +" people there will be " +total+" handshakes");
	}
}


// output:

// Algorithm
// For N = 8
// handshakes  =  ( (N-1) * N ) / 2  =  ( 8 x 7 )/2  =  28
// Print Result

// is = 28

  
