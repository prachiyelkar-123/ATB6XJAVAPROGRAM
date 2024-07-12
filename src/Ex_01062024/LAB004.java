package Ex_01062024;

import java.util.TreeSet;

public class LAB004 {
    public static void main(String[] args) {
        TreeSet numSet = new TreeSet();
        numSet.add(50);
        numSet.add(20);
        numSet.add(10);
        numSet.add(10);
      //  numSet.add("Pramod"); // java.lang.ClassCastException
        System.out.println(numSet);
    }
}