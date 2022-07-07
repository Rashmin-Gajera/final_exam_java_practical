/**
 * Problem Statement: 
 * Implement a class students. A student has a name and total quiz score. student attempt different number of quiz..so used reged array method
 *   
 * *****maintain all students name data in one array(assumme student roll number is array index and it's auto generated)
 *      maintain student quiz score with using regged array concept, (Assume Max 50 students data stored)
 *      while program start...ask for input how many student's data you want to input
 *      After create method to print showStudent()... it will print name detail with roll number 
 *      Create method to check student score from given Student name
 * 
 * Supply an appropriate constructor and methods showStudent(), getAvg().
 * To compute the latter, you also need to store number os quizzes that the student took.
 */

 //read this [problem]

//imported directory
import java.util.*;

 class students{
  String student[];
  int str;
  int score[][]=new int[50][];
  
  students(int str){
      student= new String[str];
      this.str=str;
  }

  public void addQuiz(int roll, int n){
  
 
  }

  public void showStudent(){
    for(int i=0; i<str; i++){
      System.out.println(score[i][2]);
    }

  }
 } 



 public class student{
    

    public static void main(String arg[]){
    
  Scanner sc =new Scanner(System.in);
 // int numStudent=0;
  System.out.println("Enter the Strength of Class:");
 // numStudent=sc.nextInt();

 // students studentData = new students(numStudent);
  //studentData.showStudent();
  //studentData.addQuiz(i, n);
  
  sc.close();
  }

 }