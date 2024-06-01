package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Would you like to enter details for a vehicle? Answer with \"Yes or No\".");
        String response = input.nextLine();
        response = response.toLowerCase();

        if (response.equals("no")) {
            System.out.println("Okay, thanks anyway!");
        } else if (response.equals("yes")){
            System.out.println("How many vehicles would you like to enter?");
            int n = input.nextInt();

            Car[] cars = new Car[n];
            Motor[] motors = new Motor[n];

            input.nextLine();


            for (int i=0; i<n; i++) {
                System.out.println("Is the " + (i+1) + " vehicle a car or motor?");
                String response1 = input.nextLine();
                response1 = response1.toLowerCase();

                if (response1.equals("car")) {
                    System.out.println("Enter details for vehicle number " + (i + 1));
                    System.out.println("Enter the make of the vehicle: ");
                    String make = input.nextLine();

                    System.out.println("Enter the model of the vehicle: ");
                    String model = input.nextLine();

                    System.out.println("Enter the year of the vehicle: ");
                    int year = input.nextInt();

                    System.out.println("Enter number of doors: ");
                    int numOfDoors = input.nextInt();
                    input.nextLine();

                    Car car = new Car(make, model,year, numOfDoors);
                    cars[i] = car;
                } else if (response1.equals("motor")) {

                    System.out.println("Enter details for vehicle number " + (i + 1));
                    System.out.println("Enter the make of the vehicle: ");
                    String make = input.nextLine();

                    System.out.println("Enter the model of the vehicle: ");
                    String model = input.nextLine();

                    System.out.println("Enter the year of the vehicle: ");
                    int year = input.nextInt();

                    input.nextLine();

                    System.out.println("Enter engine size: ");
                    String engineSize = input.nextLine();

                    Motor motor = new Motor(make, model, year, engineSize);
                    motors[i] = motor;
                } else {
                    System.out.println("Invalid input please try again!");
                    break;
                }

            }

            for (int j = 0; j < n; j++) {
                if (cars[j] != null){
                    cars[j].printDet();
                } else if (motors[j] != null) {
                    motors[j].printDet();
                }
            }

            System.out.println("Thank you for creating " + Vehicle.counter() + " Vehicle(s)");

        }else {
            System.out.println("Invalid answer. Please try again!");
        }


    }
}
