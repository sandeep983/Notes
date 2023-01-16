package CarpetCostCalculator;

public class Carpet {
    //Instance variable
    private double cost;
    
    //Consructor
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        }
        else {
            this.cost = cost;
        }
    }
    
    //Instance method to getCost
    public double getCost() {
        return this.cost;
    }
}
