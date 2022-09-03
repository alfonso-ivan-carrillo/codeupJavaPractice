public class Employee extends Person{
    private double salary;

    public Employee() {
    }

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

    public String work(){
        return "Filling out TPS reports";
    }

    // Method Overriding
    // In addition to adding new fields, subclasses can override methods on the superclass. To do so, the subclass must
    // define a method with the same name, return type, and parameters as in the superclass. This allows the subclass to
    // provide it's own implementation of a method.
    public String sayHello(){
        return "How can I help you?";
    }

    // Access Modifiers
    // fields marked as private cannot be referenced outside of the class that defines them. This includes subclasses.
    // Often times it is the case that we want a field to be visible only to superclasses and subclasses, but not to
    // classes that use instances of these classes.
    // To provide this functionality, we can also designate a field as protected. This means that the field is not
    // visible outside of the class, but is visible to classes that extend the class that the field is defined in.

    //    public int getAge(){   // will cause an error since age is a private field
    //        return this.age;
    //    }


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
        paul.setFirstName("paul");
        paul.setLastName("pawn");
        System.out.println(paul.name);
        // paul.doWork();
        // Person class do not have access to either the salary property or doWork method. Inheritance is one-directional;
        // meaning, subclasses gain access to the fields of their superclasses, but not the other way around.

        System.out.println(paul.sayHello());  // Person class
        System.out.println(john.sayHello());  // Employee extended class - overrides person method


    }
}
