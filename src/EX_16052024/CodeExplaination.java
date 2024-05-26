package EX_16052024;

public class CodeExplaination {
    public static void main(String[] args) {
        GrandFather g = new GrandFather();
        g.home(); // What will be the output
    }
}
class Son extends Hierachicalinheritence.Father {
    void home(){
        System.out.println("3BHK");
    }
}


class Father extends GrandFather{
    void home(){
        System.out.println("2BHK");
    }
}


class GrandFather{
    void home(){
        System.out.println("1BHK");
    }
}
