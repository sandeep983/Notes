package Cylinder;

public class Circle {
    private double radius;

    //Constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }

    //Getters
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Main Method
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
    }
}
