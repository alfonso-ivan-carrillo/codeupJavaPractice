public class Employee extends Person{
    private double salary;

    // Inheritance - extend, or inherit from another class with the extends keyword in the
    // class definition. We call these subclasses, and the classes that are being inherited
    // from / extended superclasses. A subclass inherits all the fields of it's
    // superclass, and can re-use any of it's functionality.
    public Employee(String employeeName){
        super(employeeName);
    }
    // Because the Employee class extends Person: Employee objects can use the sayHello
    // method, can use the Person constructor, and have a name, lastName and firstName property.

    public void doWork(){
        System.out.println("Work, work.....");
    }


    public static void main(String[] args) {


        Employee john = new Employee("John");
        john.setFirstName("john");
        john.setLastName("miller");
        john.sayHello();
        System.out.println(john.name);
        System.out.println(john.firstName + " " + john.getLastName());

        System.out.println(john.sayHello());
        john.doWork();
        System.out.println("__________");
        Person paul = new Person("Paul");
        System.out.println(paul.name);
        // paul.doWork();
        // Person class do not have access to either the salary property or doWork method. Inheritance is one-directional;
        // meaning, subclasses gain access to the fields of their superclasses, but not the other way around.


    }
}
