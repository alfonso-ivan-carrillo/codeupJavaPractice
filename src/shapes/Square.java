package shapes;

public class Square extends Quadrilateral{
    private double side;

    public Square(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
    public void setLength(double length){
        setSide(length);
    }
    public void setWidth(double width){
        setSide(width);
    }

    public void setSide(double side){
        this.side = side;
        this.length = side;
        this.width = side;
    }


    // Constructors
//    public Square() {
//    }
//
//    public Square(int side){
//        super(side, side);      // overriding length/width of super or Rectangle class so they will be recognized as sides on Square class
//
//    // this.side = side;      *** Could also be written this way
//    // this.length = side;
//    // this.width = side;
//    }
//
//    public int getPerimeter(){
//        System.out.println("square getPerimeter");
//        return 4 * super.length;
//
//        // return 4 * side     *** this would have worked if constructor had been set up like above
//    }
//
//    public int getArea(){
//        System.out.println("square getArea");
//        return super.length * super.length;
//    }
}
