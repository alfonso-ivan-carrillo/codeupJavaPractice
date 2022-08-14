public class StringExercise {

    public static void main(String[] args) {

        String pinkFloyd = "We don't need no education.\nWe don't need no thought control.";
        // \n gives a new line
        System.out.println(pinkFloyd);

        String check = "Check \"this\" out!, \"s inside of \"s!";
        // escapes the " and doesn't treat it like the beginning of a string.
        System.out.println(check);

        String windows = "In windows, the main drive is usually C:\\";
        // escapes \ and prints it to the console
        System.out.println(windows);

        String backSlash = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslashes \\\\\\";
        System.out.println(backSlash);

    }

}
