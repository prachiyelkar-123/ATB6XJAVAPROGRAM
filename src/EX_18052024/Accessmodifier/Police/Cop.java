package EX_18052024.Accessmodifier.Police;

public class Cop {
    public int gun; // public access by anyone
    private String idCard; // Privat - only available to the cop

    public Cop(int gun){
        this.gun = gun; // PC
    }

    void canIShoot(){
        System.out.println("Of-course, Shoot!");
    }

}
