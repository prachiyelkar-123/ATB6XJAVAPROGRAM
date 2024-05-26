package Superthiskeyword;

public class Lab001 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}

class Car extends Vehical{
    private int maxspeed =  180;
    void display(){
        System.out.println("Max speed of Vehicle can be -> " + super.maxspeed);
        System.out.println("Max speed of car can be -> " + this.maxspeed);
    }



}



class Vehical{
    int maxspeed = 180;
    void message(){

        System.out.println("This is the Vehical speed ");
    }
}