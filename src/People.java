import java.text.Format;

public class People {

    private String name;
    public People(){
    }
    public People(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String sayHello(){
        return String.format("%s says hello!", this.name);
    }

    public static void main(String[] args) {

        People p1 = new People();
        p1.name = "ethan";


        System.out.println(p1.getName());
        System.out.println(p1.sayHello());

        p1.setName("Ethan");
        System.out.println(p1.getName());
        System.out.println(p1.name);

        System.out.println("-----------");

        People p2 = new People("kathy");
        System.out.println(p2.getName());

        p2.setName("Kathy");
        System.out.println(p2.getName());

        System.out.println("-------------");

        People people1 = new People("John");
        People people2 = new People("John");
        System.out.println(people1.getName().equals(people2.getName()));    // true
        System.out.println(people1 == people2);                             // false

        System.out.println("-----------");

        People people3 = new People("Jon");
        People people4 = people3;
        System.out.println(people3 == people4);     // true

        System.out.println("-----------");

        People people5 = new People("Jack");
        People people6 = people5;
        System.out.println(people5.getName());
        System.out.println(people6.getName());
//        people5.setName("Jane");
        people6.setName("jojo");
        System.out.println(people5.getName());
        System.out.println(people6.getName());
    }

}
