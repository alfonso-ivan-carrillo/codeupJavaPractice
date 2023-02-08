public class Student {
    public String name;
    public String cohort;

    private double grade;
    public String sayBye(){
        return String.format("%s says bye!", this.name);
    }

    public Student(String studentName) {   // Constructor
//        name = studentName;
//        cohort = "Unassigned";
        this(studentName, "Unassigned");
    }

    public Student (String studentName, double grade){
        this.name = studentName;
        this.grade = grade;
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

    public double shareGrade(){
        return grade;
    }
    // Visibility refers to how a class or instance field is allowed to be accessed. It allows us to encapsulate
    // the data in our classes; that is, only expose what is necessary to other classes and objects.

    // Thus far, we have used the public keyword for all of our fields. The public keyword means that the field is
    // accessible from everywhere. The next visibility keyword we'll introduce is private. When a field is
    // defined as private, it is only accessible within the class that defines it.

    // ***  A common pattern in Java is to define classes with private fields, and create methods to allow
    // access to those fields. ***




    public static void main(String[] args) {
        Student s1 = new Student("Student A");
        Student s2 = new Student("Student B", "Voyagers");
        System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
        System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"

        System.out.println("------------");

        Student s4 = new Student("joe", 80.0);
        s4.cohort = "regulus";
        System.out.println(s4.sayBye());
        System.out.println(s4.name);
        System.out.println(s4.grade);  // the private field will print out since its within the same class
        System.out.println(s4.getInfo());  // if trying to access  field out of class, would use the method created to
        // access private field

    }
}
