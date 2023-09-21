package CarpetCostCalculator;

public class Floor {
    //Instance variable / Fields
    private double width;
    private double length;
    
    //Contructor
    public Floor(double width, double length) {
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
    
    //getArea method
    public double getArea() {
        return width*length;
    }
}
