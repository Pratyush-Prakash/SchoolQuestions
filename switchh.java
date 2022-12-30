import java.util.Scanner;
public class switchh {
    public static void main (String args [])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1 for unicode from letters A to Z: ");
        System.out.println("Enter 2 for pattern: ");
        System.out.println("Enter your choice: ");
        int n = obj.nextInt();
        switch(n)
        {
            case 1:
                char ch;
                for(ch ='A';ch<='Z';ch++)
                {
                    System.out.println("Unicode of "+ch+" is "+(int)ch);
                }

            break;
            case 2:
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            break;
            default:
                System.out.println("Wrong choice");
        }

    }

}
