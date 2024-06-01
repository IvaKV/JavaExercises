package exercises;

public class Car extends Vehicle{

    private int numOfDoors;

    public Car (String make, String model, int year, int numOfDoors) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
    }

    public void printDet () {
        System.out.println("Vehicle make: " + getMake() + ", model: " + getModel() + ", year of manufacture: " + getYear());
        System.out.println("Number of doors: " + this.numOfDoors);
    }
}
