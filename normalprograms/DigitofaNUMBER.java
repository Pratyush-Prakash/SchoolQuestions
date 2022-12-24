package normalprograms;

import java.util.Scanner;
public class DigitofaNUMBER {
    public static void main (String args []) {
        int d;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        while(n>0){
            d = n%10;
            System.out.println(d);
            n=n/10;
        }

    }
}
