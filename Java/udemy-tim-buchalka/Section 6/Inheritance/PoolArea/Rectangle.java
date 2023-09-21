package PoolArea;

public class Rectangle {
    private double width;
    private double length;

    //Constructor
    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        }
        else {
            this.length = length;
        }
    }

    //Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width*length;
    }

    //Main Method
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
    }
}
