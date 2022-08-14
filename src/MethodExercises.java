public class MethodExercises {

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int minus(int num1, int num2){
        return num1 - num2;
    }

    public static int times(int num1, int num2){
        return num1 * num2;
    }

    public static int div(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public static int mod(int num1, int num2){
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 % num2;
    }

    public static void main(String[] args) {

        System.out.println(add(5, 10));
        System.out.println(minus(5, 10));
        System.out.println(times(5, 10));
        System.out.println(div(10, 5));
        System.out.println(mod(5,2));
        System.out.println(div(5,0));


    }
}
