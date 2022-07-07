import java.util.*;

public class stack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two value for addition:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // value obj=new value(n);
        sc.close();
        int sum = n - m;
        System.out.print("Addition of " + n + " and " + m + " is " + sum);

    }
}

// compile erorr: it returns error while our syntax is missing
// run time error: computer are nit able to eveluate that typr of //value
// logical error
