package Ex_01062024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LAB002 {
    public static void main(String[] args) {
        Set courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);

        for(Object o:  courseSets){
            System.out.println(o);
        }

        Iterator it = courseSets.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}