package EX_18052024.Superthiskeyword;

public class LAB003 {
    public static void main(String[] args) {
// student p1 =new student();
        collage p1 =new collage();
// If child has DC -> PC DC will be called by
        // super() automatically in Java

        // super.variable
        // super.method()
        // super() -> DC
        // super("pramod') -> PC
    }
}
class collage{
    collage(){
        System.out.println("collage - DC");
    }

    collage(String a){
        System.out.println("Student - PC");
    }


}
class student extends collage{
    student(){
        super("Prachi");
        System.out.println("student - DC");
    }

}