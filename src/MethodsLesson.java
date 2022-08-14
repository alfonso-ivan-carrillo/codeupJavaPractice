public class MethodsLesson {

//    Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void sayHello(int times){
        for (int i = 0; i < times; i++){
            sayHello();
        }
    }
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void sayHello(String greeting, String name){
        System.out.printf("%s, %s!\n", greeting, name);
    }

    public static int returnThree(){
        return 3;
    }

    public static String shout(String s){
        return s.toUpperCase() + "!!!";
    }

    public static void main(String[] args) {

        sayHello(5);

        System.out.println(sayHello("Alfonso"));

        sayHello("What's up", "Ethan");

        System.out.println(returnThree());

        System.out.println(shout("party"));




    }
}
