import java.io.*;

public class Main
{
    public static void cnt_decoding_digits(char[] dig, int a)
    {
        int cnt[] = new int[a+ 1];

        cnt[0] = 1;

        cnt[1] = 1;

        for (int k = 2; k <= a; k++) 
        { 
            cnt[k] = 0; 

            cnt[k] = cnt[k-1];

            if (dig[k-2] == '1' || (dig[k-2] == '2' && dig[k-1] < '7') )

                cnt[k] += cnt[k-2];
                
                System.out.println(cnt[a]);
        }
        // return cnt[a];
    }
    public static void main (String[] args)
    {
        String s="11111";

        char[] dig= s.toCharArray();
cnt_decoding_digits(dig, 5);
        // System.out.println(cnt_decoding_digits(dig, 5));
    }
}


// Output :

// dig[] = {1,1,1,1,1}
// cnt = {1,1,1,2,3,5,8}
//   cnt[a] = 8

// 0
// 0
// 0
// 8
