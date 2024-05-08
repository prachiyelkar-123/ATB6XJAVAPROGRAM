package EX_07052024;

import java.util.Scanner;

import static EX_07052024.LAB_006.mul;
import static EX_07052024.LAB_006.sub;
import static java.lang.Integer.sum;

public class LAB_008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int r_sum = sum(num1,num2);
        int r_sub = sub(num1,num2);
        int r_mul = mul(num1,num2);

        System.out.println("sum is->" + r_sum);
        System.out.println("sub is ->" + r_sub);
        System.out.println("mul is ->" + r_mul);
    }
}
