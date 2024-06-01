package EX_18052024.Methodoveridding;

public class Runerclass {
    public static void main(String[] args) {
        Parent p = new Parent();
            p.Father();

            Child c =new Child();
            c.Father();

        Parent p1 = new Child();
        p1.Father();
    }
}
