package SeriesandPatterns;
import java.util.Scanner;
public class patterns {
    public static void main (String args []) {
        //pattern1(0);
       // pattern2(1);
        pattern3();
    }
        static void pattern1(int s){
            // S = x1 - x2 + x3 - x4 + x5 .......... - x20
            for(int i =1;i<=20;i++){
                int term = (int)Math.pow(2,i);
                if(i%2==0) {
                    s = s - term;
                }else if(i%2!=0){
                    s=s+term;
                }
            }
             System.out.println(s);
        }
        static void pattern2(int term){
           // 1 11 111 1111 11111
            for(int i=1;i<=5;i++){
                System.out.print(term+" ");
                term = term*10+1;
            }


        }

        static void pattern3() {
        /*  1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

           */
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print(j + " ");
                System.out.println();
            }


        }














}
