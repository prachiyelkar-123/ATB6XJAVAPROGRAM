package Multilevelinheritence;

public class RunnerClass {
    public static void main(String[] args) {
        Prachi pRef = new Prachi();
        pRef.home();

        Father fRef =new Father();
        fRef.home();

        Grandfather gRef =new Grandfather();
        gRef.home();
    }


}
