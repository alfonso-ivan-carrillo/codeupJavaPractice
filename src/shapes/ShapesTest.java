package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5,4);

        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
        System.out.println("length is: "+ box1.length + " and width is: " + box1.width);


        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
        System.out.println("length is: "+ box2.length + " and width is: " + box2.width);

        Square box3 = new Square(5);
        System.out.println(box3.getPerimeter());
        System.out.println(box3.getArea());

    }
}
