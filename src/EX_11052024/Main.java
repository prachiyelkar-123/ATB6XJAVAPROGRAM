package EX_11052024;

public class Main {
    public static void main(String[] args) {
        Student Prachi = new Student();
        Prachi.name = "Prachi Yelkar";
        Prachi.ID = "213";
        System.out.println(Prachi.name);
        System.out.println(Prachi.ID);

        Course Autotesting = new Course();
        Autotesting.name = "Testing";
        System.out.println(Autotesting.name);

        Autotesting.Coursefee = ("5000");
        System.out.println(Autotesting.Coursefee);

        Payment Card = new Payment();
        Card.modeofpayment = "CreditCard";
        System.out.println(Card.modeofpayment);

        Student Pradnya = new Student();
        Pradnya.name = "Pradnya Yelkar";
        System.out.println(Pradnya.name);

        Course ATB6X = new Course();
        ATB6X.Coursefee = "Common";;
        System.out.println(ATB6X.Coursefee);

        Payment Cash = new Payment();
        Cash.paymentstatus = "Paid";
        System.out.println(Cash.paymentstatus);

    }

}
