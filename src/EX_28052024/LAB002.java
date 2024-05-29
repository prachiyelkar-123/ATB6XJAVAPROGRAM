package EX_28052024;

import java.util.ArrayList;
import java.util.List;

public class LAB002 {
    public static void main(String[] args) {
        // List mylist1 = new List();
        // List is an interface , can you create object of List interface?
        // List mylist2 = new ArrayList();
        // List is an interface , can you create object of ArrayList class?
        List mylist = new ArrayList();
        ArrayList mylist1 = new ArrayList();
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll

        mylist.add("Prachi");
        mylist.add("Pradnya");
        mylist.add("Alka");
        mylist.add("Eknath"); // Duplicate
        mylist.add("Prachi");
        mylist.add("Prachi");
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.add("Yelkar");
        System.out.println(mylist);
        mylist.add("8424");
        System.out.println(mylist);
        mylist.set(2, "AlkaYelkar");
        System.out.println(mylist);

        mylist.remove("Prachi");
        // Removes the first occurrence of the specified element from this list,
        System.out.println(mylist);

        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());

        mylist.add("Yelkar");
        System.out.println(mylist);
        System.out.println(" ------ ");

        // How to print ?
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        // for each
        for (Object obj : mylist) {
            System.out.println(obj);
        }


    }
}