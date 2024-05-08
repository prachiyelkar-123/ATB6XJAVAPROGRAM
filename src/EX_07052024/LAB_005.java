package EX_07052024;


public class LAB_005 {
    public static void main(String[] args) {
        int n1 = sumOfTwo(50,50);
        System.out.println(n1);

        String name = sumoftwo("Prachi", 100);
        System.out.println(name);
    }
    static int sumOfTwo(int a, int b) {
        return a + b;
    }
static String sumoftwo(String a, int b) {
        return a+b;
}

}
