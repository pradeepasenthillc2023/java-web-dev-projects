public class SmartPhone extends Computer {
    // Additional Property
    private String networkType;
    private double screenSize;

    // Constructor
    public SmartPhone(String brand, String model, String processor, int ram, int storage, String networkType, double screenSize) {
        super(brand, model, processor, ram, storage);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    // Additional Method
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }
}
