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
      /*
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


       */
     /*
        int counter, num, item, array[], first, last, middle;
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = input.nextInt();

        //Creating array to store the all the numbers
        array = new int[num];

        System.out.println("Enter " + num + " integers");
        //Loop to store each numbers in array
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Enter the search value:");
        item = input.nextInt();
        first = 0;
        last = num - 1;
        middle = (first + last)/2;

        while( first <= last )
        {
            if ( array[middle] < item )
                first = middle + 1;
            else if ( array[middle] == item )
            {
                System.out.println(item + " found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(item + " is not found.\n");


      */
      /*
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("Enter number to be searched: ");
        n = obj.nextInt();
        int[] array = new int[10];
        for(int i =0;i<array.length;i++){
            array[i] = obj.nextInt();
            if(array[i]==n)
            {
                System.out.println(i);
                break;
            }
        }
       */
        /*

        Scanner obj = new Scanner(System.in);
        int[] list = new int[15];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<list.length;i++)
        {
            list[i] = obj.nextInt();
        }
        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length-i-1;j++)
            {
                if(list[j]>list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i]);
        }
         */

/*
        Scanner obj = new Scanner(System.in);
        int index = -1;
        int[] array = new int[10];
        System.out.println("Enter elemetns of array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i] = obj.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int n = obj.nextInt();
        for(int i=0;i<array.length;i++)
        {
            if(n==array[i])
            {
                index = i;
            }
        }
        System.out.println("Index is: "+index);
 */

        Scanner obj = new Scanner(System.in);
        int index = -1;
        int start,end,mid;
        int[] array = new int[15];
        start = 0;
        end = array.length-1;
        System.out.println("Enter elemetns of array: ");
        for(int i =0;i<array.length;i++)
        {
            array[i] = obj.nextInt();
        }
        System.out.println("Enter number you want to search: ");
        int n = obj.nextInt();
        while(start<=end)
        {
            mid = (start+end)/2;
            if(n==array[mid])
            {
                index = mid;
                break;
            }else if(n<array[mid])
            {
                end = mid-1;
            }else
                start = mid+1;
        }
        if(index>0)
        {
            System.out.println(index);
        }else
            System.out.println("not found");























    }

    }

