
/**
 * Thread
 */
class New implements Runnable
{

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class check {
    public static void main(String[] args) {
        System.out.println("Test for the thread Program");
        New obj = new New();
        Thread t = new Thread(obj);
        //Thread t = new Thread(obj);
        t.start();
        
    }
}
