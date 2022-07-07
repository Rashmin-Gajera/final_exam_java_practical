class mul {
    int mul;

    synchronized public void table(int mul) {
        this.mul = mul;
        int current = this.mul;
        System.out.println("\nTable of the " + mul + " is the...............");
        for (int i = 0; i < 10; i++) {

            System.out.print(current + "  ");
            current += this.mul;
        }
        System.out.println("\nTable ends here....................");
    }

}

class A extends Thread {
    mul th1;

    A(mul t) {
        th1 = t;
    }

    @Override
    public void run() {
        th1.table(2);
    }

}

class B extends Thread {
    mul th2;

    B(mul t) {
        th2 = t;
    }

    @Override
    public void run() {
        th2.table(50);
    }

}

public class sync {

    public static void main(String[] args) {
        mul obj = new mul();
        A one = new A(obj);
        B two = new B(obj);
        one.start();
        two.start();

    }

}