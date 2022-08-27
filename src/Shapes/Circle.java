package Shapes;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCir(){
        return 2* Math.PI * radius;
    }

    public double gitArea(){
        return Math.PI * (radius * radius );
    }

}
