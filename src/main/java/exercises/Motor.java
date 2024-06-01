package exercises;

public class Motor extends Vehicle{
    private String engineSize;

    public Motor (String make, String model, int year, String engineSize) {
        super(make, model, year);
        this.engineSize = engineSize;
    }

    public void printDet () {
        System.out.println("Vehicle make: " + getMake() + ", model: " + getModel() + ", year of manufacture: " + getYear());
        System.out.println("Engine size: " + engineSize);
    }
}
