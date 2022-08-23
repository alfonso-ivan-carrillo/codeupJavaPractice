package Shapes;

public class Circle {
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getCir(double radius){
        double cir = 2* Math.PI * radius;
        return cir;
    }

    public double gitArea(double radius){
        double area = Math.PI * (radius * radius );
        return area;
    }

}
