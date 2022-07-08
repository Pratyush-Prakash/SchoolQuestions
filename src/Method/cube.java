package Method;
import java.util.Scanner;
public class cube {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);
        int n=10;
      //  n= obj.nextInt();
         n = findcube(n);
        System.out.println(n);

    }
    public static int findcube(int x) {
        int result = x*x*x;
        return result;
    }


}
