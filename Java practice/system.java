/**
 * Problem Statement:
 * Implement a class students. A student has a name and total quiz score.
 * student attempt different number of quiz..so used reged array method
 * 
 * *****maintain all students name data in one array(assumme student roll number
 * is array index and it's auto generated)
 * maintain student quiz score with using regged array concept, (Assume Max 50
 * students data stored)
 * while program start...ask for input how many student's data you want to input
 * After create method to print showStudent()... it will print name detail with
 * roll number
 * Create method to check student score from given Student name
 * 
 * Supply an appropriate constructor and methods showStudent(), getAvg().
 * To compute the latter, you also need to store number os quizzes that the
 * student took.
 */


import java.util.*;

class student {

    int roll;
    String Name;
    String[] Subject_name = new String[6];
    int[] marks = new int[6];

    void avg() {
        int avg = 0;

        for (int i = 0; i < 6; i++) {
            if (marks[i] != 0) {
                avg += marks[i];

            } else {
                double avg_total = 0;
                avg_total = avg / i;
                System.out.println(Name + " Got a " + avg_total + "%");
            }

        }

    }

}

public class system {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        student[] Data;
        int Strength;
        System.out.println("Enter Strength of Student:");
        Strength = sc.nextInt();

        Data = new student[Strength];
        boolean flag=true;
        int choice;

        while (flag==true) {
            
            System.out.print("\n\n");
            System.out.println("\t   Operation List ");
            System.out.println("--------------------------------");
            System.out.println("    For Enter Student Details  : 1 ");
            System.out.println("    For Search Student Details : 2 ");
            System.out.println("    For Edit Details           : 3 ");
            System.out.println("    Terminate Progran          : 4 ");
            System.out.println("--------------------------------");
            System.out.print("Enter Your Operation:");
            choice = sc.nextInt();


        }
        
        sc.close();
    }
}