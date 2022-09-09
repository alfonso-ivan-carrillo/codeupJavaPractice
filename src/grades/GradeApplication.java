package grades;

import java.util.HashMap;

public class GradeApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student alfonso = new Student("alfonso");
        alfonso.addGrade(90);
        alfonso.addGrade(100);
        alfonso.addGrade(80);

        Student kathy = new Student("kathy");
        kathy.addGrade(99);
        kathy.addGrade(95);
        kathy.addGrade(90);

        Student ethan = new Student("ethan");
        ethan.addGrade(90);
        ethan.addGrade(95);
        ethan.addGrade(100);

        students.put("alfonso", alfonso);
        students.put("kathy", kathy);
        students.put("ethan", ethan);

        System.out.println(students);

    }
}
