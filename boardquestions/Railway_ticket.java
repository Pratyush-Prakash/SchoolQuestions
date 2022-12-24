package boardquestions;
import java.util.Scanner;
public class Railway_ticket {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;
    void accept(){
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter name: ");
        name = obj.nextLine();
        System.out.println("Enter your type of coach: ");
        coach = obj.nextLine();
        System.out.println("Enter your mobile number: ");
        mobno = obj.nextLong();
        System.out.println("Enter basic amount of ticket: ");
        amt = obj.nextInt();
    }
    void update(){
        if(coach.equals("First_AC")){
            totalamt = amt+700;
        }else if(coach.equalsIgnoreCase("Second_AC")){
            totalamt = amt+500;
        }else if(coach.equalsIgnoreCase("Third_AC")){
            totalamt = amt+250;
        }else if(coach.equalsIgnoreCase("Sleeper")){
            totalamt = amt;
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Type of coach: "+coach);
        System.out.println("Total amount: "+totalamt);
        System.out.println("Mobile number: "+mobno);
    }
    public static void main(String args[]){
        Railway_ticket obj = new Railway_ticket();
        obj.accept();
        obj.update();
        obj.display();
    }
}
