import java.util.Scanner;
public class AreaofSPHERE {
    public static void main (String args []) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter radius: ");
        int r;
        r = obj.nextInt();
        double area = 4*3.14*r*r;
        System.out.println(area);
    }

}
