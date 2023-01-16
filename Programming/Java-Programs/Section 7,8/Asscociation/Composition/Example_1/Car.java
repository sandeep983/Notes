package Composition.Example_1;

public class Car {

    private String color;
    private int max_speed; 

    //set car color
    public void setColor(String color) {
        this.color = color;
    }
    //set car speed
    public void setMaxSpeed(int max_speed) {
        this.max_speed = max_speed;
    }

    public void carDetails(){
        System.out.println("Car Color = "+ color + ", Max Speed = " + max_speed);
    }
}
