public class PolymorphismDemo {

    // Polymorphism is a feature of inheritance that allows us to treat objects of different subclasses that have the
    // same superclass as if they were of the superclass type. Methods or variables that are defined with a superclass
    // type can accept objects that are a subclass of that type.
    public static void doWork(Employee e){
        System.out.println(e.work());
    }


    public static void main(String[] args) {
        Employee one = new Employee();
        Employee two = new Employee();



        doWork(one);    // prints out: "Filling out TPS reports"
        doWork(two);    // prints out: "Managing employees"
        // Inside of doWork, when the work method is called, the implementation that is used depends on the type of the
        // object that was passed in, not the type of the reference. In this example, the reference is of type Employee,
        // but we can pass in objects of type Employee or of type Manager.

        // the final keyword used to prevent reassignment, but we can also use it to prevent inheritance or overriding.
        // It can also be used with method parameters, like with variables, to prevent reassignment.
    }
}
