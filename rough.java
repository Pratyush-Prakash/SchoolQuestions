import java.util.Scanner;
public class rough {

    public static void main(String args [])
    {
       /*
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = obj.nextLine();
        input = " "+input;
        System.out.println(input.toUpperCase());
        int a=0;
        int len = input.length();
       // input = input.toUpperCase();
        for(int i=0;i<len-1;i++){
            if(input.charAt(i)== ' ' && input.charAt(i+1) == 'a')
                a++;
        }
        System.out.println(a);
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                word += Character.toUpperCase(str.charAt(i));
            }
            else {
                word += str.charAt(i);
            }
        }

        System.out.println(word);
    }

    }

