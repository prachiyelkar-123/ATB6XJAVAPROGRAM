package EX_18052024.Methodoverloading;

public class LAB001 {


    // Method OverLoading -> multiple methods with same name, but different argument.
    // order also matters

    void Gift(String a){
        System.out.println("A is a String" +  a);
    }

    int Gift(int x){
        System.out.println("X is a Int" +  x);
        return x;
    }

    int Gift(float x){
        System.out.println("X is a Int" +  x);
        return 89;
    }

    void Gift(double x){
        System.out.println("X is a double" +  x);
    }

    void a(int pramod,float amit){

    }
    void a(float y,int x){

    }

    public static void main(String[] args) {
        LAB001 p = new LAB001();
        p.Gift(10);
        p.Gift("Pramod");
        p.Gift("12345698789");
    }
}
