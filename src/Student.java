public class Student {
    public String name;
    public String cohort;

    public Student(String studentName) {   // Constructor
//        name = studentName;
//        cohort = "Unassigned";
        this(studentName, "Unassigned");
    }


    public Student(String studentName, String assignedCohort) { // Constructor
//        name = studentName;
//        cohort = assignedCohort;
        this.name = studentName;
        this.cohort = assignedCohort;
    }
    // A common use case for constructors is to set, or provide default values for, an object's fields

    // The first constructor accepts the student's name and sets the value of the name field based on what is passed to it.
    // It also sets the value of the cohort field to the string Unassigned. The second constructor allows us to specify
    // values for both the student's name and the cohort when the object is created.

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    }


    public static void main(String[] args) {
        Student s1 = new Student("Student A");
        Student s2 = new Student("Student B", "Voyagers");
        System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
        System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"
    }

}
