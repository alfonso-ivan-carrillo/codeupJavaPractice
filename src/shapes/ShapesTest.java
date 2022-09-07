package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Quadrilateral myShape = new Rectangle(4, 5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Square(6);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());




        // code was to test square and rectangle before the abstract and interface lesson

//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        System.out.println("length is: "+ box1.length + " and width is: " + box1.width);
//
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println("length is: "+ box2.length + " and width is: " + box2.width);
//
//        Square box3 = new Square(5);
//        System.out.println(box3.getPerimeter());
//        System.out.println(box3.getArea());

    }
}
