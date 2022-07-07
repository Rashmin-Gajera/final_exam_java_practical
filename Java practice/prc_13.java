import java.util.*;

public class prc_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your expression:");
        String expr = sc.nextLine();
        int or_l_s = 0, or_l_e = 0, or_r_s = 0, or_r_e = expr.length();
        char current;
        int operator = 0, ans = 0;
        boolean flag = true, oprd = false, first = true;

        for (int i = 0; i < expr.length(); i++) {
            current = expr.charAt(i);
            if (current > 47 && current <= 57) {

                if (operator == 0) {
                    if (first == true) {
                        first = false;
                        or_l_s = i;
                        oprd = true;
                    }
                } else {
                    if (first == true) {
                        first = false;
                        oprd = true;
                        or_r_s = i;
                    }
                }
            } else if (current == ' ') {
                if (operator == 0) {

                    if (oprd == false) {
                        continue;
                    } else {
                        or_l_e = i;
                        oprd = false;
                        first = true;
                    }
                } else {

                    if (oprd == false) {
                        continue;
                    } else {
                        or_r_e = i;
                        oprd = false;
                        break;
                    }
                }
            } else if (current == '+' || current == '-' || current == '*' || current == '/') {
                operator = i;
                if (oprd == true) {
                    or_l_e = i;
                    oprd = false;
                    first = true;
                }
            } else {
                flag = false;
                System.out.println("Expression " + expr + " is not valid");
                break;
            }
        }

        System.out.println(or_l_s + "  " + or_l_e + "  " + or_r_s + "  " + or_r_e);

        if (flag == true) {
            switch (expr.charAt(operator)) {
                case '+':
                    ans = Integer.parseInt(expr.substring(or_l_s, or_l_e))   
                            + Integer.parseInt(expr.substring(or_r_s, or_r_e));
                    break;
                case '-':
                    ans = Integer.parseInt(expr.substring(or_l_s, or_l_e))
                            - Integer.parseInt(expr.substring(or_r_s, or_r_e));

                    break;
                case '*':
                    ans = Integer.parseInt(expr.substring(or_l_s, or_l_e))
                            * Integer.parseInt(expr.substring(or_r_s, or_r_e));

                    break;
                case '/':
                    ans = Integer.parseInt(expr.substring(or_l_s, or_l_e))
                            / Integer.parseInt(expr.substring(or_r_s, or_r_e));
                    break;

                default:
                    break;
            }
            System.out.println(expr.substring(or_l_s, or_l_e) + " " + expr.charAt(operator) + " "
                    + expr.substring(or_r_s, or_r_e) + " = " + ans);
        }

        sc.close();

    }
}