package boardquestions;
import java.util.Scanner;
/*Design a class name ShowRoom with the following description :
Instance variables/ Data members :
String name – To store the name of the customer
long mobno – To store the mobile number of the customer
double cost – To store the cost of the items purchased
double dis – To store the discount amount
double amount – To store the amount to be paid after discount
Member methods: –
ShowRoom() – default constructor to initialize data members
void input() – To input customer name, mobile number, cost
void calculate() – To calculate discount on the cost of purchased items, based on following criteria
        cost                          discount
        <=10000                         5
        <=20000                         10
        <=35000                         15
        >35000                          20
*/

public class Showroom {
    String name;
    long mobno;
    double dis,cost,amount;
    public void showroom(){
         name="";
         mobno=0;
         dis=0.0;cost=0.0;amount=0.0;
    }
    public void input(){
        Scanner obj = new Scanner(System.in);
        System.out.print("enter name: ");
        name = obj.next();
        System.out.print("enter mobilenumber: ");
        mobno = obj.nextLong();
        System.out.print("enter cost: ");
        cost = obj.nextDouble();
    }
    public void calculate(){
        if(cost<=10000){
            dis = cost*5/100;
            amount = cost-dis;
        }else if(cost>10000&&cost<=20000){
            dis = cost*10/100;
            amount = cost-dis;
        }else if(cost>20000&&cost<=35000){
            dis = cost*15/100;
            amount = cost-dis;
        }else if(cost>35000){
            dis = cost*20/100;
            amount = cost-dis;
        }
    }
    public void display(){
        System.out.println(name);
        System.out.println(mobno);
        System.out.println(amount);
    }
    public static void main (String args []){
        Showroom sc = new Showroom();
        sc.input();
        sc.calculate();
        sc.display();
    }


}
