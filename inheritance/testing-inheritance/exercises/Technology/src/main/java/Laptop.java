public class Laptop extends Computer {
    // Additional Property
    private int batteryLife;
    private double weight;

    // Constructor
    public Laptop(String brand, String model, String processor, int ram, int storage, int batteryLife, double weight) {
        super(brand, model, processor, ram, storage);
        this.batteryLife = batteryLife;
        this.weight = weight;
    }

    // Additional Method
    public void carry() {
        System.out.println("Carrying the laptop...");
    }

    // Additional Method
    public void useTouchpad() {
        System.out.println("Using the touchpad...");
    }
}

