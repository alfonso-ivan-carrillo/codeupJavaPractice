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

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }

    public static void count (int n){
        if(n <= 0){
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);        // calls itself but reduce the value by 1 until n == 0
    }

//    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }
    public static void main(String[] args) {

        System.out.println(getPower(2, 3));


        sayHello(5);

        System.out.println(sayHello("Alfonso"));

        sayHello("What's up", "Ethan");

        System.out.println(returnThree());

        System.out.println(shout("party"));

        String codeUp = "Codeup";

        changeString(codeUp);

        System.out.println(codeUp); // Value still Codeup

        count(5);

    }
}
