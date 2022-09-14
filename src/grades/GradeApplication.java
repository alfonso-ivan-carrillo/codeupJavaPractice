package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradeApplication {
    private static Input input = new Input();


    public static void gradeReport(){
        HashMap<String, Student> students = new HashMap<>();
        Student alfonso = new Student("alfonso carrillo");
        alfonso.addGrade(90);
        alfonso.addGrade(100);
        alfonso.addGrade(80);

        Student kathy = new Student("kathy maddocks");
        kathy.addGrade(99);
        kathy.addGrade(95);
        kathy.addGrade(90);

        Student ethan = new Student("ethan carrillo");
        ethan.addGrade(90);
        ethan.addGrade(95);
        ethan.addGrade(100);

        students.put("mekca", alfonso);
        students.put("bellaGit", kathy);
        students.put("busterGit", ethan);


        System.out.println("Welcome!\n");

        do{
            System.out.println("Here are the GitHub usernames of our students:\n");
            System.out.println(students.keySet());
            System.out.println("\nWhat student would you like to see more information on?");
            Scanner scn = new Scanner(System.in);
            String userInput = scn.nextLine();
            System.out.println(students.containsKey(userInput));
            for(int i = 0; i < students.size(); i++){
                if(students.containsKey(userInput)){
                    System.out.printf("name: %s -- GitHub Usernames: %s \nGrade Average: %.2f \n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());
                    break;
                } else {
                    System.out.printf("Sorry, no student found with the GitHub username of | %s | \n", userInput);
                    break;
                }
            }
        }while (input.yesNo("\nDo you want to continue?"));





    }

    public static void main(String[] args) {

//        HashMap<String, Student> students = new HashMap<>();
//        Student alfonso = new Student("alfonso");
//        alfonso.addGrade(90);
//        alfonso.addGrade(100);
//        alfonso.addGrade(80);
//
//        Student kathy = new Student("kathy");
//        kathy.addGrade(99);
//        kathy.addGrade(95);
//        kathy.addGrade(90);
//
//        Student ethan = new Student("ethan");
//        ethan.addGrade(90);
//        ethan.addGrade(95);
//        ethan.addGrade(100);
//
//        students.put("mekca", alfonso);
//        students.put("kathy", kathy);
//        students.put("ethan", ethan);
//
//        System.out.println(students.keySet());
//        System.out.println(students.containsKey("mekca"));




        gradeReport();
    }
}
