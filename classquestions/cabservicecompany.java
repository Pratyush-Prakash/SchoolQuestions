package classquestions;
import java.util.Scanner;
public class cabservicecompany {
    String Car_type;
    double km;
    double bill;
    public cabservicecompany()
    {
        Car_type = "";
        km = 0.0;
        bill = 0.0;
    }
    void accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter car type: ");
        Car_type = obj.nextLine();
        System.out.println("Enter km of car: ");
        km = obj.nextDouble();
    }
    void calculate()
    {
        if(Car_type.equalsIgnoreCase("AC"))
        {
            if (km <= 5.0)
                bill = 150;
            if (km > 5.0)
                bill = 150+ (km-5)*10;
        }else if(Car_type.equalsIgnoreCase("NONAC"))
        {
            if (km <= 5.0)
                bill = 120;
            if (km > 5.0)
                bill = 120+ (km-5)*10;
        }

    }
    void display()
    {
        System.out.println(bill);
    }
    public static void main(String args[]) {
        cabservicecompany br = new cabservicecompany();
        br.accept();
        br.calculate();
        br.display();
    }

}

