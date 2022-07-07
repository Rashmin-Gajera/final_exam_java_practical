import java.util.Scanner;

public class check1 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int a = s.nextInt();
        System.out.println("Enter 2nd integer");
        int b = s.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));
    }
    //recursive function to return gcd of a and b
   public static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}

