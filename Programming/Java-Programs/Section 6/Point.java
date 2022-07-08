//Question 2. Point
/*
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

Where √ represents square root.


TEST EXAMPLE
→ TEST CODE:
Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());

OUTPUT
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

NOTE: Use Math.sqrt to calculate the square root √.
NOTE: Try to avoid duplicated code.
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 7 methods.
NOTE: Do not add a main method to the solution code.
*/

//Solution 2. Point
class Point {
    private int x;
    private int y;

    //Default Constructor/ No-arg Constructor
    public Point() {

    }

    //Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y; 
    }

    //Getters and Setters
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
    
    public void setY(int y) {
        this.y = y;
    }public int getY() {
        return this.y;
    }
    
    //Formula d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    //xB=0, xA=this.x, yB=0, yA=this.y

    //Distance
    public double distance() {
        System.out.println("Distance with no parameters called");
        return distance(0,0);    
    }

    //Distance with two parameters
    public double distance(int x, int y) {
        System.out.println("Distance with two parameters called");
        //System.out.println("X="+x+", Y="+y+", this.x="+this.x+", this.y="+this.y);
        return Math.sqrt((x-getX())*(x-getX()) + (y-getY())*(y-getY()));
    }

    //Distance with parameter of another type Point
    public double distance(Point another) {
        System.out.println("Distance with parameter of another type or Point called");
        return distance(another.getX(), another.getY());
    }

    //Main method
    public static void main(String args[]){
        //X=0, Y=0, this.x=0, this.y=0
        Point empty_point = new Point();
        System.out.println("distance()= " + empty_point.distance());

        //X=0, Y=0, this.x=6, this.y=5
        Point first = new Point(6, 5);
        System.out.println("distance(0,0)= " + first.distance());

        //X=3, Y=1, this.x=6, this.y=5
        Point second = new Point(3, 1);
        System.out.println("distance(second)= " + first.distance(second));

        //X=2, Y=2, this.x=6, this.y=5
        System.out.println("distance(2,2)= " + first.distance(2, 2));    
    }
}
