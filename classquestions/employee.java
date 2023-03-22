package classquestions;


import java.util.Scanner;

public class employee {
    int eno,age,basic;
    String ename;
        void accept()
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter number of employee: ");
            eno = obj.nextInt();
            System.out.println("Enter name of employee: ");
            ename = obj.nextLine();
            System.out.println("Enter age of employee: ");
            age = obj.nextInt();
            System.out.println("Enter basic salary of employee: ");
            basic = obj.nextInt();
        }

        void calculate()
        {

        }




    public static void main(String[] args)
    {

    }








}