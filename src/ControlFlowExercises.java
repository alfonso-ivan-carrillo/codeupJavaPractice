public class ControlFlowExercises {


    public static void main(String[] args) {

        int i = 5;
        while (i <= 15){
            System.out.println("i is now: " + i);
            i++;
        }

        int d = 0;

        do {
            System.out.println("d is now: " + d);
            d += 2;
        } while (d <= 100);

        System.out.println("--------");

        int s = 100;

        do {
            System.out.println("s is now: " + s);
            s -= 5;
        } while (s >= -10);

        System.out.println("--------");

        int squared = 2;

        do {
            System.out.println(squared);
            squared = (int) Math.pow(squared, 2);
        } while (squared <= 65536);

        System.out.println("--------oo");

        for (int b = 5; b <= 15; b++){
            System.out.println(b);
        }

        System.out.println("--------");

        for (int f = 0; f <= 100; f += 2){
            System.out.println(f);
        }

        System.out.println("--------");

        for (int p = 100; p >= -10; p -= 5){
            System.out.println(p);
        }

        System.out.println("--------");

        for (int t = 2; t <= 65536; t = (int) Math.pow(t, 2)){
            System.out.println(t);
        }
    }
}
