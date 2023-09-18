public class Computer {
    // Properties
    private String brand;
    private String model;
    private String processor;
    private int ram;
    private int storage;

    // Constructor
    public Computer(String brand, String model, String processor, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Method 1
    public void powerOn() {
        System.out.println("The computer is powering on...");
    }

    // Method 2
    public void powerOff() {
        System.out.println("The computer is powering off...");
    }

    // Method 3
    public void loadOS(String os) {
        System.out.println("Loading " + os + " operating system...");
    }
}

