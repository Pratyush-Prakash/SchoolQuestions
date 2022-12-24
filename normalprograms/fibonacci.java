package normalprograms;
//import java.util.Scanner;
public class fibonacci {
    public static void main (String[] args){
        int i =1;
        int j=0,k=1,l;
        while(i<=10){
            l = j+k;
            System.out.println(j);
            j=k;
            k=l;
            i++;
        }

    }
}
