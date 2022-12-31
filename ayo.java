import java.util.Locale;
import java.util.Scanner;
public class ayo {
/*
Write a program to input a sentence and convert it into uppercase and count and display the total number of words starting with a letter ‘A’
 */
    /*
    public static void main(String args [])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = obj.nextLine();
        input = " "+input;
        System.out.println(input.toUpperCase());
        int a=0;
        for(int i=0;i<=input.length()-1;i++){
            if(input.charAt(i)==' '){
                if(input.charAt(i+1)== 'A')
                    a++;

            }
        }
        System.out.println(a);

    }
     */
public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = in.nextLine();
    str = " " + str; //Add space in the begining of str
    int c = 0;
    int len = str.length();
    str = str.toUpperCase();
    for (int i = 0; i < len - 1; i++) {
        if (str.charAt(i) == ' ' && str.charAt(i + 1) == 'A')
            c++;
    }
    System.out.println("Total number of words starting with letter 'A' = " + c);





}


}
