package Ex_01062024;

import java.util.LinkedHashSet;
import java.util.Set;

public class LAB003 {
    public static void main(String[] args) {
        Set courseSets = new LinkedHashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);
    }
}