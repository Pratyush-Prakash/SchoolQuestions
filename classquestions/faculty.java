package classquestions;
import java.util.Scanner;
public class faculty {
    int fcode,yoe;
    String name,category;
    double basicsal,gradepay,grosssal;

    void accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter code: ");
        fcode = obj.nextInt();
        System.out.println("Enter name: ");
        name = obj.nextLine();
        System.out.println("Enter category: ");
        category = obj.next().toUpperCase();
        System.out.println("Enter experience: ");
        yoe = obj.nextInt();

    }
    void display()
    {
        System.out.println("Code of employee is "+fcode);
        System.out.println("Name of employee is "+name);
        System.out.println("Category of employee is "+category);
        System.out.println("Years of experience is "+yoe);
        System.out.println("basic salary is "+basicsal);
        System.out.println("grade pay is "+gradepay);
        System.out.println("gross salary is "+grosssal);

    }
    void compute()
    {
        if(category.equals("PRT") && yoe<10)
        {
            basicsal = 15000;
        }else if(category.equals("PRT")&& yoe>=10)
        {
            basicsal = 17500;
        }else if(category.equals("TGT") && yoe<10)
        {
            basicsal = 20000;
        }else if(category.equals("TGT") && yoe>=10)
        {
            basicsal = 35000;
        }else if(category.equals("PGT")&&yoe<10)
        {
            basicsal = 30000;
        }else if(category.equals("PGT")&& yoe>=10)
        {
            basicsal = 45000;
        }
        gradepay = basicsal*0.5;
        grosssal = basicsal+gradepay;
    }
    public static void main(String[] args)
    {
        faculty object = new faculty();
        object.accept();
        object.compute();
        object.display();
    }
}
