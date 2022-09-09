package grades;

import java.util.ArrayList;

public class StudentTest {


    public static void main(String[] args) {


        Student alfonso = new Student("alfonso"  );
        alfonso.addGrade(100);
        alfonso.addGrade(80);
        alfonso.addGrade(90);
        System.out.println(alfonso.getName());
        System.out.println("The average grade for this student is: " + alfonso.getGradeAverage());
        System.out.println(alfonso.getGrades());


    }
}
