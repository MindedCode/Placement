
/*
  Input : 4
  Output : 5167
  Explanation : 1 + (2*3) + (4*5*6) + (7*8*9*10) = 5167.

*/
class Main
{
  public static void main (String args[])
  {
    int n = 3;
    System.out.println (term (1, 1, n));
  }
// Recursive function 
  static int term (int calculated, int current, int N)
  {
    int i, cur = 1;
    // Base Condition
    if (current == N + 1)
      return 0;
    // product of terms till current
    for (i = calculated; i < calculated + current; i++)
      cur *= i;
    return cur + term (i, current + 1, N);
  }
}
