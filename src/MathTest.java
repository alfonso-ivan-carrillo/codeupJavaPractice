public class MathTest {

    public static void main(String[] args) {

        System.out.println(Arithmetic.add(5, 5));
        System.out.println(Arithmetic.multiply(5, 5));
        System.out.println(Arithmetic.pi);

        System.out.println("-------------");

//      from student class
        Student s3 = new Student("Student C", 95.5);
        System.out.println(s3.name);  // prints "Student C"
//      System.out.println(s3.grade);  // DON'T DO THIS - private properties can't be accessed outside the class
                                        // will result in compile time error
        System.out.println(s3.shareGrade());  // do this instead

    }
}
