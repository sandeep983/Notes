package CarpetCostCalculator;

public class Calculator {
    //Instance Variable
    private Floor floor;
    private Carpet carpet;
    
    //Constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    
    //Instance method to getTotalCost
    public double getTotalCost() {
        return floor.getArea()*carpet.getCost();
    }
}
