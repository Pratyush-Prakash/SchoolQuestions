package boardquestions;


import java.util.Scanner;

public class employee {
    int eno; //employee number
    String ename; //employee name
    int age; // age of employee
    int basic; // basic salary of employee
    double net; //net income of employee
    void accept(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        ename = obj.nextLine();
        System.out.print("Enter your number: ");
        eno = obj.nextInt();
        System.out.print("Enter your age: ");
        age = obj.nextInt();
        System.out.print("Enter your basic salary: ");
        basic = obj.nextInt();
    }
    void calculate(){
        double hra;
        double da;
        double pf;
        hra = (18.5/100)*basic;
        da =(17.45/100)*basic;
        pf =(8.10/100)*basic;
        net = basic+hra+da-pf;
        if(age>50){
            net = net+5000;
        }
    }
    void print(){
        System.out.println("Number of employee: "+eno);
        System.out.println("Name of employee: "+ename);
        System.out.println("Age of employee: "+age);
        System.out.println("Basic pay of employee: "+basic);
        System.out.println("Net income of employee: "+net);

    }
    public static void main (String args []){
        employee obj = new employee();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
