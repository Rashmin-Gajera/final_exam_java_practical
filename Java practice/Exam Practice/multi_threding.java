/**
 * Thread
 */
class td1 extends Thread {

    public void run() {
        for (int i = 1; i < 10; i++) {

            System.out.println("Thread_1:" + i);
            if (i == 2) {
                System.out.println("Thread one is going for sleep");
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }
    }
}

class td2 extends Thread {

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Thread_2:" + i);
        }

    }
}

class td3 extends Thread {

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Thread_3:" + i);
        }

    }
}

public class multi_threding {
    public static void main(String[] args) {
        System.out.println("Test for the thread Program");
        td1 obj1 = new td1();
        td2 obj2 = new td2();
        td3 obj3 = new td3();

        // Thread t = new Thread(obj);
        // Thread t = new Thread(obj);
        obj1.start();
        obj2.start();
        obj3.start();

    }
}
