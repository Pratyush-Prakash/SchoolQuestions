package SeriesandPatterns;
import java.util.Scanner;
public class starTRIANGLEonCHOICE {
    public static void main (String args []) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1 for triangle or 2 for inverted triangle ");
        int choice = obj.nextInt();
        switch (choice){
            case 1 :
                for(int i =1;i<=10;i++){
                    for(int j = 1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2 :
                for(int i =10;i>=1;i--){
                    for(int j = 1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();

        }
                break;

        }




    }
}
