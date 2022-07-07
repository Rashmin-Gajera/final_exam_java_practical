public class repitative {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int mul = 1;

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        if (y < 0) {
            throw new ArithmeticException("You have entered the negative number of y");
        }

        for (int i = 0; i < y; i++) {
            mul *= x;
        }

        System.out.println(mul);
    }
}
