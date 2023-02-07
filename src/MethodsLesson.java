public class MethodsLesson {

//todo  basic method syntax
//      public static returnType methodName([param1, [, param2[, ....]]){
//          (the statements of the method)
//          (a return statement, if a return type is declared)
//      }
// .
//    Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
    public static void sayHello(){
        System.out.println("Hello, World");
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

    public static char charUp(char c){
        return Character.toUpperCase(c);
    }

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        System.out.println(s);
    }

//todo      Recursion - the concept of solving a problem by dividing it into smaller chunks.
//          Core idea of recursion is creating a method that calls itself, but with different
//          parameters that were originally passed
    public static void count (int n){
//todo  Whenever you are writing a recursive method, you must make sure to have a base case or a stop
//      condition so that the methods does not call itself over and over again indefinitely.
        if(n <= 0){
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
//todo   Recursion happening below - calls itself, but parameters are different, wil reduce value by 1 until n == 0
        count(n - 1);
    }

//    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }

//todo  Recursion example
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {        //todo  base cases
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }
    public static void main(String[] args) {

        System.out.println(getPower(5, 3));


        sayHello(5);

        System.out.println(sayHello("Alfonso"));

        sayHello("What's up", "Ethan");

        System.out.println(returnThree());

        System.out.println(shout("party"));

//todo  note to declare a CHAR use only single quotes, if double quotes used, java will consider it a STRING
        char eta = 'c';
        System.out.println(charUp('e'));
        System.out.println(charUp(eta));
        System.out.println(charUp('a'));

        String codeUp = "Codeup";

        changeString(codeUp);       // Value will be: Wub a lub a dub dub


        System.out.println(codeUp); // Value still Codeup

        count(5);
        count(10);

    }
}
