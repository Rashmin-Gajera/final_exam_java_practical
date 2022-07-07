class A {
    int a = 5;
}

class B extends A {
    int b = 5;
    int a = 10;

    void print() {
        System.out.println("A=" + super.a);
        System.out.println("B=" + b);

    }
}

class C extends B {
    int b = 50;
    int a = 15;

    void print() {
        System.out.println("A=" + super.a);
        System.out.println("B=" + b);

    }

    void dispaly() {
       super.print();

    }
}

public class inheritance {
    public static void main(String[] args) {

        C n = new C();
        n.dispaly();

    }
}
