package Composition.Example_1;

public class Main {
    public static void main(String[] args) {        
        Honda HondaCity = new Honda();
        HondaCity.setColor("Silver");
        HondaCity.setMaxSpeed(180);
        HondaCity.carDetails();
        HondaCity.HondaStart();
    }
}
