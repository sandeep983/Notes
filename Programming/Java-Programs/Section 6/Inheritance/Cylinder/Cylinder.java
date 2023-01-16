package Cylinder;

public class Cylinder extends Circle {
    private double height;

    //Construcor
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    //Getters
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    //Main method
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

}
