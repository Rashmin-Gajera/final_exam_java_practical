
/**
 * Information: Stack Program for Perform Basics Operaion 
 * Operations: Push, Pop, Print
 * Version: 1.000
 * Owner: Rashmin Gajera <rashmingajera12@gmail.com>
 * Created Date : 29 March 2022 (IST) 9:43 pm
 */



import java.util.*;

//stack class
class Stack {

    // basics variable help in stack

    int[] stack;
    int top = -1;
    int size;

    // we cant't define int size at a start of program because int size is not fixed
    // so we assign stack size from constucor
Stack (int size){

    this.size=size;
    stack = new int[size];
    
}

//push methpd for add data on stack
    void Push(int data) {

        if (top < size - 1) {

            top += 1;
            stack[top] = data;
            System.out.println("\nData " + data + " Sucessfully Entered at Place " + (top + 1));

        } else {
            System.out.println("Warning: Stack Is overFlow !");
        }

    }
//for print stack data
    void Print() {
        System.out.println("Your Stack Data:");
        for (int i = 0; i <= top; i++) {

            System.out.print("  " + stack[i]);

        }
    }

//for remove data from stack
    int Pop() {
        if (top == -1) {
            System.out.println("Warning: Stack Have Empty !");
            return 0;
        } else {
            int y = stack[top];
            System.out.println("\nData " + y + " Sucessfully Remove From Place " + (top + 1));
            top -= 1;
            return y;

        }

    }

}




//main method
public class newStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input, choice;
        System.out.print("Enter Stack Size:");
        input = sc.nextInt();
        Stack stack = new Stack(input);
        Boolean flag = true;

        while (flag == true) {

            System.out.print("\n\n");
            System.out.println("\t Stack Table ");
            System.out.println("--------------------------------");
            System.out.println("    For Push Operation: 1 ");
            System.out.println("    For Pop Operation : 2 ");
            System.out.println("    For Print Data    : 3 ");
            System.out.println("    Terminate Progran : 4 ");
            System.out.println("--------------------------------");
            System.out.print("Enter Your Operation:");
            choice = sc.nextInt();


            switch (choice) {


                case 1:
                int data;
                System.out.print("\nEnter Your Your Data:");
                data= sc.nextInt();
                stack.Push(data);
                    break;
                case 2:
                stack.Pop();
                    break;
                case 3:
                stack.Print();
                    break;
                case 4:
                flag=false;
                    break;
                default:
                System.out.print("\nEnter Valid Operation NUmber");
                    break;
            }

        }

        

        sc.close();

    }

}