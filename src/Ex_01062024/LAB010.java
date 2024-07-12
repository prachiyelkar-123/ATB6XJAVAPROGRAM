package Ex_01062024;

public class LAB010 {
    public static void main(String[] args) {
        printF(3,4);
        printF("pramod","dutta");
        printF(true,false);
        printF(3.12,4.34);
    }

    private static <PRMAOD> void printF(PRMAOD i, PRMAOD i1) {
        System.out.println(i);
        System.out.println(i1);
    }
}
