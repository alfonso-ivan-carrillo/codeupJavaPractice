package util;

public class InputTest {

    public static void main(String[] args) {

        Input two = new Input();
        System.out.println(two.getString());
        System.out.println(two.yesNo());
        System.out.println(two.getInt(1, 10));
        System.out.println(two.getInt());
        System.out.println(two.getDouble(2.5, 15.5));
        System.out.println(two.getDouble());;
        System.out.println(two.getString("Enter your name:"));
    }
}
