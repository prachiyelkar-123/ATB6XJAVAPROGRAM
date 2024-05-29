package EX_28052024;

import java.util.List;

public class LAB001 {
    public static void main(String[] args) {
        List Shopping_list = List.of("Milk", "butter", "grossery", "suger");
        System.out.println(Shopping_list);
        System.out.println(Shopping_list.size());

        List my_10th_marks = List.of("95", "80", "60", "70", "75", "90");
        System.out.println(my_10th_marks);
        System.out.println(my_10th_marks.size());

        List Subject_list = List.of("English", "Marathi", "Maths", "Hindi", "Science");
        System.out.println(Subject_list);
        System.out.println(Subject_list.size());


        System.out.println(Shopping_list.get(0));
        System.out.println(Shopping_list.indexOf("butter"));

        System.out.println(Shopping_list.isEmpty());
    }
}
