package shapes;

public class Rectangle {
    // fields
    protected int length;
    protected int width;

    // Constructors
    public Rectangle() {
    }

    public Rectangle(int length) {
        this.length = length;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Methods
    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }

}
