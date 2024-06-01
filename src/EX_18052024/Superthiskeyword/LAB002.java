package EX_18052024.Superthiskeyword;

public class LAB002 {
    public static void main(String[] args) {
prachi p1 = new prachi();
p1.display();
    }
}

class prachi extends person{
void message(){
    System.out.println("Prachi is topper student");
}
void display(){
    this.message();
    super.message();
}

}




class person{
    void message(){
        System.out.println("Strengger person");
    }
}