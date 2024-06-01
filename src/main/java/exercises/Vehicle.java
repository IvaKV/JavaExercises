package exercises;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    private static int counter;

    public Vehicle (String make, String model,  int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        counter++;
    }
    public void printDet () {
        System.out.println("Vehicle make: " + this.make + ", model: " + this.model + ", year of manufacture: " + this.year);
    }

    public static int counter () {
        return counter;
    }


    public String getMake () {
        return this.make;
    }

    public String getModel () {
        return this.model;
    }

    public int getYear () {
        return this.year;
    }
}
