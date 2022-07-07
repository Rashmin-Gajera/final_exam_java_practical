interface MyCamera {
    void takeSnap();

    void recordVideo();

    default void greet() {
        System.out.println("Good Morning..");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(double phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class MySmartphone extends MyCellPhone implements MyWifi, MyCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }

    public void record4KVideo(){
    System.out.println("Taking snap and recoding in 4k");
    }
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Harry", "Prashanth", "Anjali5G" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class try1 {
    public static void main(String[] args) {
        MyCamera cam = new MySmartphone(); // this is a smartphone but please use it as a camrera
        // cam.getnetwork(); ---- not allow wifi na function na use thay sake
        // cam.samplemeth(); ------not allow bcz smartphone ka method heee
        cam.record4KVideo();
        // only use mycamre's method

        MySmartphone s = new MySmartphone();
        // s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(987688);
        // in short je refrence ma layeee like mycmare refrence ma lidho to aeni jj
        // method call karisakiye
    }
}