package EX_28052024;



import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LAB006 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(); // CR - CO
        mylist1.add("Pradnya");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("Pradnya"); // t1
        v.add("Anusha"); // t1
        v.add("Kiran");
        v.add("Prachi");// t1
        v.remove("Kiran"); // t1
        v.remove("Anusha");

        // can you guess the o/p?

        System.out.println(v);



    }
}
