/**
 * greet
 */
class greet {
 public  void namaste() {
     System.out.println("Namaste India!");
 }
    
}

public class methods {
    public void grt() {
        System.out.println("Hello India!");
    }
    public static void main(String[] args) {
        System.out.println("Hello everyone how are you?");
        greet gt = new greet();
        methods mt = new methods();
        gt.namaste();
        mt.grt();
    }
}
