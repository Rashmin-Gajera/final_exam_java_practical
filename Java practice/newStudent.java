/**
 * Implement a class Student. A student has a name and total quiz score.
 * Supply an approproate constructor and methods getName(), addQuizz(), getTotalScore() and getAverageScore().
 * alsp]o number of quizes needed
 * 
 */

 class Student{
  String name;
  int[] quiz;
  int Attempted_quiz;
  int total=0 ;
  int avg=0;


  Student(String name, int num){
  this.name=name;
  this.Attempted_quiz=num;
  quiz=new int[num];
  }
 
 int getTotalScore(){
    
    



    return total;
 }


 }
public class newStudent {
    public static void main() {
        
    }
}
