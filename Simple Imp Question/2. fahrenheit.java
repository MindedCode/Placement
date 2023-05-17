/******************************************************************************

                            Fahrenheit to celsius
                            °C = [(°F-32)×5]/9.
                            f = (c+160)/45
                            C = 5/9 x (F-32)
                            ° F = ( °C × 9 5 ) + 32.
                            f = [(c-160)/45]
                            ° F = ( °C × 9 5 ) + 32.

*******************************************************************************/

public class Main {
    static void fahrenheit(int n) {
        float celsius = (n - 32) * (5.0f / 9.0f);
        celsius = Math.round(celsius * 100) / 100.0f;
        System.out.println(celsius);
    }

    public static void main(String[] args) {
        int n = 97;

        fahrenheit(n);
    }
}


36.11
36.111115
