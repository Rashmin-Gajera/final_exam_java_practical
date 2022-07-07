import java.util.*;

public class prc_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your expression:");
        String cal = sc.nextLine();
        int or_l_s = 0, or_l_e = 0, or_r_s = 0, or_r_e = cal.length();
        char current;
        int operator = 0, ans = 0;
        boolean flag = true, oprd = false, first = true;

        for (int i = 0; i < cal.length(); i++) {
            current = cal.charAt(i);
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
                System.out.println("Expression " + cal + " is not valid");
                break;
            }
        }

        System.out.println(or_l_s + "  " + or_l_e + "  " + or_r_s + "  " + or_r_e);

        if (flag == true) {
            switch (cal.charAt(operator)) {
                case '+':
                    ans = Integer.parseInt(cal.substring(or_l_s, or_l_e))
                            + Integer.parseInt(cal.substring(or_r_s, or_r_e));
                    break;
                case '-':
                    ans = Integer.parseInt(cal.substring(or_l_s, or_l_e))
                            - Integer.parseInt(cal.substring(or_r_s, or_r_e));

                    break;
                case '*':
                    ans = Integer.parseInt(cal.substring(or_l_s, or_l_e))
                            * Integer.parseInt(cal.substring(or_r_s, or_r_e));

                    break;
                case '/':
                    ans = Integer.parseInt(cal.substring(or_l_s, or_l_e))
                            / Integer.parseInt(cal.substring(or_r_s, or_r_e));
                    break;

                default:
                    break;
            }
            System.out.println(cal.substring(or_l_s, or_l_e) + " " + cal.charAt(operator) + " "
                    + cal.substring(or_r_s, or_r_e) + " = " + ans);
        }

        sc.close();

    }
}
