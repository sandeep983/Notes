package PoolArea;

public class Cuboid extends Rectangle {
    private double height;

    //Constructor
    public Cuboid(double width, double length, double height) {
        //Calling parent constructor
        super(width, length);

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

    //Main Method
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }




    
}
