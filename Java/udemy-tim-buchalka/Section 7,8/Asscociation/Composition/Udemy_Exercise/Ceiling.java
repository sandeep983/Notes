package Composition.Udemy_Exercise;

public class Ceiling {
    private int height, paintedColor;

    //Constructor
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //Getters
    public int getHeight() {
        return this.height;
    }

    public int getPaintedColor() {
        return this.paintedColor;
    }
}
