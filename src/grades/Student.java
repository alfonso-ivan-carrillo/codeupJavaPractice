package grades;

import java.util.ArrayList;

import static java.lang.Math.round;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(){
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }


    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

//    public double getGradeAverage(){
//        double sum = 0;
//        for(int i = 0; i < grades.size(); i++){
//            sum += grades.get(i);   // grades.get(i) get the actual grade, if you only use i, then it adds the index of element
////            System.out.println(grades.get(i));
//        }
//        return (sum / grades.size());
//    }

    public double getGradeAverage(){
        double sum = 0;
        for ( int grade : grades){  // takes the value of the element instead of the index
            sum += grade;
        }
        // add round Math method to round result to decimals
        return (round(sum / grades.size()));
    }


}
