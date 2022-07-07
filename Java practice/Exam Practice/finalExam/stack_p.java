import java.util.*;

class stack {

    int stack[];
    int top = -1;
    int size = 0;

    stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int element) {
        if (top < size - 1) {
            top = top + 1;
            stack[top] = element;
            System.out.println("The element " + stack[top] + " is push sucessfully!\n");

        } else {
            System.out.println("Your stack is the overflow\n");
        }
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("The element " + stack[top] + " is poped sucessfully!\n");
            top = top - 1;

        } else {
            System.out.println("Your stack is the underflow\n");
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "  ");

        }
    }

}

public class stack_p {

    public static void main(String[] args) {
        int size;
        boolean flag = true;
        int choice, element;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        size = sc.nextInt();

        stack stk = new stack(size);

        while (flag == true) {
            System.out.println("\n Choice list:\n 1: Push Operation \n 2: Pop Operation \n 3: Print the stack element\n 4: Exit\n ");

            System.out.print("Your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element:");
                    element = sc.nextInt();
                    stk.push(element);
                    break;

                case 2:
                    stk.pop();
                    break;

                case 3:
                    stk.print();
                    break;

                case 4:
                    flag = false;
                    break;

                default:
                    break;
            }
        }
        sc.close();

    }
}