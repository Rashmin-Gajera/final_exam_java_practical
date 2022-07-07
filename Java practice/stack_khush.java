import java.util.*;

class value {

    int n;
    int A[];
    int top = -1;

    value(int size) {
        this.n = size;
        A = new int[size];
    }

    // push method
    void insert(int val) {

        if (top < n - 1) {

            top = top + 1;
            A[top] = val;
            System.out.println(A[top] + " Inserted Sucessfully");

        } else {
            System.out.println("\n**STACK Is OverFlow \n");
        }

    }

    // pop method
    int pop() {
        int y = 0;
        if (top == -1) {
            System.out.println("STACK IS Under Flow!");

        } else {
            y = A[top];
            top = top - 1;
        }
        return y;
    }

    // display method

    void display() {
        System.out.println("Your Stack data is:");

        for (int q = 0; q <= top; q++) {
            System.out.print("  " + A[q]);
        }
    }

}

public class stack_khush {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("SIZE OF STACK:");
        int size = scn.nextInt();
        value obj = new value(size);

        int flag = 1;

        while (flag == 1) {
            System.out.println("\n___________");
            System.out.println(" 1:INSERT \n 2:DELETE \n 3:DISPLAY     \n 4:EXIT");
            System.out.println("___________");
            System.out.print(" Enter Operation Number:");
            int o = scn.nextInt();

            switch (o) {
                case 1:
                    System.out.print("ENTER NUM:");
                    int num = scn.nextInt();
                    obj.insert(num);
                    break;

                case 2:
                    System.out.println("POPED VALUE:" + obj.pop());
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    flag = 0;
                    break;

                default:
                    System.out.println("WRONG NUM ENTERED");

            }

        }
        System.out.println("THANK YOU");

        scn.close();

    }

}