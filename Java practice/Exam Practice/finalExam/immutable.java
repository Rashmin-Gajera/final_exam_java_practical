
final class Circle {

    public final int radius;
    final double PI = 3.14;

    Circle(int r) {
        this.radius = r;
    }

    final void area() {
        double area;
        area = PI * radius * radius;
        System.out.println("area of the circle is the " + area);
    }
}

public class immutable {

    public static void main(String[] args) {
        Circle c = new Circle(12);
        c.area();
        // c.area();

    }
}