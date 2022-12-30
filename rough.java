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
      /*
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
       */
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }

    }

