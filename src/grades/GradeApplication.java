package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class GradeApplication {
    private static Input input = new Input();

    public static void printClassAverage(HashMap<String, Student> students) {
        System.out.println("Class average:");
        LinkedList<Double> avgs = new LinkedList<>();
        students.forEach((name, student) -> avgs.add(student.getGradeAverage()));
        double sum = avgs.stream().mapToDouble(avg -> avg).sum();
        System.out.println(sum / avgs.size());
    }


    public static void allStudents(String username, Student student){
        System.out.printf("%s, %s, %.2f \n", student.getName(), username, student.getGradeAverage());
    }


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
            System.out.println(students.keySet() + "\nor \"print all\"?");
            System.out.println("\nWhat student would you like to see more information on?");
            Scanner scn = new Scanner(System.in);
            String userInput = scn.nextLine();
//            System.out.println(students.containsKey(userInput));
            if(students.containsKey(userInput)){
                    System.out.printf("name: %s -- GitHub Usernames: %s \nStudent's Grades %s \nGrade Average: %.2f \n", students.get(userInput).getName(), userInput, students.get(userInput).getGrades(), students.get(userInput).getGradeAverage());

            } else if (userInput.equalsIgnoreCase("print all")){
                for (Student name: students.values()) {
                    System.out.println(name.getName() + " " + name.getGradeAverage());
                    System.out.println(students.values());
                }

            } else {
                System.out.printf("Sorry, no student found with the GitHub username of | %s | \n", userInput);
                break;
            }

        }while (input.yesNo("\nDo you want to continue?"));
        System.out.println("Bye.");
    }

    public static void main(String[] args) {
//
//        HashMap<String, Student> students = new HashMap<>();
//        Student alfonso = new Student("alfonso");
//        alfonso.addGrade(90);
//        alfonso.addGrade(100);
//        alfonso.addGrade(80);
//        students.put("mekca", alfonso);
//
//        System.out.println(students.keySet());
//        System.out.println(students.get("mekca").getName());
//        System.out.println(students.get("mekca").getGradeAverage());
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
//
//        students.put("kathy", kathy);
//        students.put("ethan", ethan);

//        System.out.println(students.keySet());
//        System.out.println(students.containsKey("mekca"));



        gradeReport();
//
//        HashMap<String, Integer> items = new HashMap<>();
//        items.put("coins", 5);
//        items.put("pens", 2);
//        items.put("chairs", 7);
//
//        items.forEach((k, v) -> {
//            System.out.format("key: %s, value: %d%n", k, v);
//        });

    }
}
