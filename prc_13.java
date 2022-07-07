import java.util.*;

public class prc_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr;
        char current;
        int l;
        int operands = 0, operator = 0, space = 0;
        boolean flag = true;
        System.out.print("Enter Your Expression:");
        expr = sc.nextLine();
        l = expr.length();

        for (int i = 0; i < l; i++) {
            current = expr.charAt(i);

            if (current == 42 || current == 43 || current == 45 || current == 47) {
                operator++;
            } else if (current >= 48 && current <= 57) {
                operands++;
            } else if (current == ' ') {
                space++;
            } else {
                flag = false;
            }

        }
        if (flag == true) {
            System.out.println(expr + " is a valid Expression");

            int result = 0;
            int i = 0;

            while (expr.charAt(i) != '+' && expr.charAt(i) != '-' && expr.charAt(i) != '*' && expr.charAt(i) != '/') {
                i++;
            }

            switch (expr.charAt(i)) {
                case '+':
                    result = Integer.parseInt(expr.substring(0, i))
                            + Integer.parseInt(expr.substring(i + 1, expr.length()));
                    break;
                case '-':
                    result = Integer.parseInt(expr.substring(0, i))
                            - Integer.parseInt(expr.substring(i + 1, expr.length()));
                    break;
                case '*':
                    result = Integer.parseInt(expr.substring(0, i))
                            * Integer.parseInt(expr.substring(i + 1, expr.length()));
                    break;
                case '/':
                    result = Integer.parseInt(expr.substring(0, i))
                            / Integer.parseInt(expr.substring(i + 1, expr.length()));
                    break;
            }

            System.out.println(expr.substring(0, i) + ' ' + expr.charAt(i) + ' ' + expr.substring(i + 1, expr.length())
                    + " = " + result);


            sc.close();
        }
    }
}
