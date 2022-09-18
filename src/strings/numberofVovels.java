package strings;
import java.util.Scanner;
public class numberofVovels {
    public static void main(String args[]) {
        int f=0;
        Scanner obj = new Scanner(System.in);
        String n = obj.nextLine();
        int d = n.length()-1;
        for (int i = 0; i <= d; i++) {
            char c = n.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                 f++;
            }

        }
        System.out.println(f);
    }
}
