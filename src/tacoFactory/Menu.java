package tacoFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    public static void displayMenu(){
        String[] tacoList = {"1. fajita", "2. chicken fajita", "3. carne guisada", "4. bacon & egg", "5. sausage & egg", "6. al-pastor"};
        for (int i = 0; i < tacoList.length; i++){
            System.out.println(tacoList [i]);
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
