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

    // Bonus

    public static int multLoop(int num1, int num2){

        int total = 0;
        for(int i = 1; i <= num2; i++){
         total += num1;
//            System.out.println(total);
        }
        return total;
    }

    public static int multRec(int num1, int num2){
        int total = 0;
        if (num2 == 0){
            return 0;
        } else {
//            System.out.println(num1);
//            System.out.println(num2 - 1);

            total += num1 + multRec(num1, num2 - 1);
//            System.out.println(num1);
//            System.out.println(num2 - 1);
//            System.out.println("total: "+ total);
            return total;
        }
    }

    public static void main(String[] args) {

        System.out.println(add(5, 10));
        System.out.println(minus(5, 10));
        System.out.println(times(5, 10));
        System.out.println(div(10, 5));
        System.out.println(mod(5,2));
        System.out.println(div(5,0));

        System.out.println(multLoop(5,5));
        System.out.println(multRec(5,5));


    }
}
