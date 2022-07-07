import java.util.*;

public class khush_p {
    public static void main(String[] arg) {
        String name[] = new String[5];
        int roll_no[] = new int[5];

        int sub[] = new int[25];

        Scanner sc = new Scanner(System.in);
        int i, j;

        for (i = 0; i < 5; ++i) {
            System.out.print("Enter Roll no: ");
            roll_no[i] = sc.nextInt();
            System.out.print("Enter name: ");
            name[i] = sc.next();

            for (j = 0; j < 5; j++) {
                System.out.print("Enter" + " " + (j+1) + " " + "sub marks: ");
                sub[j] = sc.nextInt();

            }
        }
        sc.close();
    }

   
}