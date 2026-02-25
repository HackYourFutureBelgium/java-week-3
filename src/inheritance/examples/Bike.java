package inheritance.examples;

// Subclass
public class Bike extends Vehicle {
    int extraWheelsCount;
    String creationDate;

    public Bike(String brand, int extraWheelsCount, String creationDate) {
        super(brand);
        this.extraWheelsCount = extraWheelsCount;
        this.creationDate = creationDate;
    }

    protected void setBikeBrand(String b) {
        super.brand = b;
    }

    @Override
    public void drive()
    {
        System.out.println(brand + " bike is zooming...");
    }
}
