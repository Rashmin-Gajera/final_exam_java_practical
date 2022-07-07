import java.util.Scanner;

class ageexception extends RuntimeException {

    ageexception(String s) {
        super(s);
    }
}

class voter {

    voter(int age) {
        this.age = age;
    }

    int age;

    public void vote() throws ageexception, ArithmeticException, ArrayIndexOutOfBoundsException {
        if (age <= 18) {
            throw new ageexception("you are not eligible for vote");
        } else {
            System.out.println("vote suceesfully");
        }

    }
}

public class key_word {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age:");
        int Age = sc.nextInt();
        voter vt = new voter(Age);

        try {
            vt.vote();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("after error accour this code is work .....");

        sc.close();
    }

}