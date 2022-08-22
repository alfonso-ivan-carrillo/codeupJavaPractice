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

    }

}
