package EX_18052024.Accessmodifier.Police.Criminal;

import EX_18052024.Accessmodifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
    }
}
