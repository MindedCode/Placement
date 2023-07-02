class Main {
  
    static void convert_to_words(char[] n)
    {
    
        int l = n.length;
 
        // Base cases
        if (l == 0) {
            System.out.println("empty string");
            return;
        }
        if (l > 4) {
            System.out.println(
                "length more than 4 is not supported");
            return;
        }
 
        String[] s_digits = new String[] {
            "zero", "one", "two",   "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
 
        String[] two_digits = new String[] {
            "",          "ten",      "eleven",  "twelve",
            "thirteen",  "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
        };
 
        String[] tens_multiple = new String[] {
            "",      "",      "twenty",  "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };
 
        String[] tens_power = new String[] { "hundred", "thousand" };
 
        System.out.print(String.valueOf(n) + ": ");

        if (l == 1) {
            System.out.println(s_digits[n[0] - '0']);
            return;
        }
 
        int x = 0;
        while (x < n.length) { if (l >= 3) {
                if (n[x] - '0' != 0) {
                    System.out.print(s_digits[n[x] - '0'] + " ");
                    System.out.print(tens_power[l - 3] + " ");
                    
                }
                --l;
            }
 
            else {
        
                if (n[x] - '0' == 1) {
                    int sum
                        = n[x] - '0' + n[x + 1] - '0';
                    System.out.println(two_digits[sum]);
                    return;
                }
 
                else if (n[x] - '0' == 2
                         && n[x + 1] - '0' == 0) {
                    System.out.println("twenty");
                    return;
                }
 
                else {
                    int i = (n[x] - '0');
                    if (i > 0)
                        System.out.print(tens_multiple[i] + " ");
                    else
                        System.out.print("");
                    ++x;
                    if (n[x] - '0' != 0)
                        System.out.println(s_digits[n[x] - '0']);
                }
            }
            ++x;
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        convert_to_words("1000".toCharArray());
    }
}


// Output is:

//   1121 : one thousand one hundred twenty one
//   1000: one thousand 
