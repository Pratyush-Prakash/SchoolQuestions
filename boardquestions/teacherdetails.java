package boardquestions;
public class teacherdetails {
    String name,address;
    long phone;
    String subject;
    int slary,incometax;
    public void accept()
    {
        name = "hello";
        address ="teri";
        phone = 12345678910l;
        subject = "maths";
        slary = 200000;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(phone);
        System.out.println(subject);
        System.out.println(slary);
        System.out.println(incometax);
    }
    public void tax()
    {
        if(slary>175000)
        {
            incometax = (int) 0.5*slary;
        }

    }

    public static void main(String args[])
    {
        teacherdetails obj = new teacherdetails();
        obj.accept();
        obj.tax();
        obj.display();
    }

}
