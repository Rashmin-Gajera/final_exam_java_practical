import java.util.*;

class Circle {

    public int radius;
    double PI = 3.14;

    Circle(int r) {
        this.radius = r;
    }

    double area() {
        double area;
        area = PI * radius * radius;
        // System.out.println("area of the circle is the " + area);
        return area;
    }
}

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> ary = new ArrayList<Integer>();
        ary.add(10);
        ary.add(14);
        ary.add(45);

        System.out.println(ary);
        Iterator irt = ary.iterator();
        int i = 0;
        while (irt.hasNext()) {
            System.out.println(irt.next());

        }

        ary.add(2, 56);
        System.out.println(ary);

        System.out.println(ary.getClass());

        Stack<String> myfriend = new Stack<String>();
        myfriend.push("Shyam");
        myfriend.push("Sharvit");
        myfriend.push("Miral");
        myfriend.push("Khushbu");
        myfriend.push("Arya");
        myfriend.push("Yachi");
        System.out.println(myfriend);
        System.out.println(myfriend.peek());
        myfriend.pop();
        myfriend.pop();
        System.out.println(myfriend);

        Queue<String> name = new LinkedList<>();
        name.offer("hello");
        name.offer("how");
        name.offer("are");
        name.offer("you");

        System.out.println(name);
        System.out.println(name.remove());
        System.out.println(name);

        ArrayList<Circle> ay = new ArrayList<Circle>();
        // 
        

        ay.add(new Circle(12));
        ay.add(new Circle(120));
        ay.add(new Circle(120));
        ay.add(new Circle(120));
        ay.add(new Circle(120));


        System.out.println(ay);
        System.out.println((ay.get(0)).area());



    }
}
