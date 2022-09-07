package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    // fields
//    protected int length;
//    protected int width;
//
//    // Constructors
//    public Rectangle() {
//    }
//
//    public Rectangle(int length) {
//        this.length = length;
//    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    // Getters and Setters
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    // Methods
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }


    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
