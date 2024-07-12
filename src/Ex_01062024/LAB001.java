package Ex_01062024;

import java.util.HashSet;
import java.util.Set;

public class LAB001 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet();
        fruits.add("Appple");
        fruits.add("Banana");
        fruits.add("Jackfruite");
        fruits.add("Mango");
        fruits.add("Appple");
        fruits.add("Water Melon");
        fruits.add("Appple");
        System.out.println("fruite");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Water Melon");
        System.out.println(fruits);







    }
}