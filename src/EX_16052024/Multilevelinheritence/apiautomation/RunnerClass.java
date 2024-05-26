package Multilevelinheritence.apiautomation;

public class RunnerClass {
    public static void main(String[] args) {
        Test t1 =new Test();
        t1.opensqlconnection();
        t1.openexcelfile();

        Basetest b1 =new Basetest();
        b1.openexcelfile();

    }
}
