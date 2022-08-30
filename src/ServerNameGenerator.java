import java.util.Random;

public class ServerNameGenerator {


    public static String random(String array1[], String array2[]){
        String one = array1[(int) (Math.random() * array1.length)];
        String two = array2[(int) (Math.random() * array2.length)];

        return one + " " + two;
    }

    public static String randomInd(String array1[], String array2[]){
        int randInt1 = new Random().nextInt(array1.length);
        int randInt2 = new Random().nextInt(array2.length);

        return array1[randInt1] + " - " + array2[randInt2];
    }

    public static String getRandom(String[] array){
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {

        String[] weapon = {"gun", "bow", "knife", "bomb", "rifle"};
        String[] ammo = {"bullet", "arrow", "posion", "napalm", "fire"};

        System.out.println(random(weapon, ammo));
        System.out.println("------------------");
        System.out.println(getRandom(weapon));
        System.out.println("------------------");
        System.out.println(randomInd(weapon, ammo));

    }
}
