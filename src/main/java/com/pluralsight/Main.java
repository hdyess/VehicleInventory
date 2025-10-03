package com.pluralsight;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner getInput = new Scanner(System.in);
    private static Vehicle[] vehicleInventory = new Vehicle[20];


    //program feature functions
    //todo:most of these functions

    //lists all vehicles in vehicleInventory
    public static void listInventory() {
        System.out.println("\n");
        for (Vehicle car : vehicleInventory) {
            System.out.println(car);
        }
    }

    //searches vehicleInventory by make and model
    public static void searchMakeModel() {

    }

    //searches vehicles by price range
    public static void searchPriceRange() {

    }

    //searches vehicles by color
    public static void searchColor() {

    }

    //adds a vehicle to vehicleInventory
    public static void addVehicle() {

    }

    //actual program with hard coded stuff
    public static void main(String[] args) {

        boolean running = true;
        int vehicleCount;

        //initialize and preload vehicle inventory


        vehicleInventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicleInventory[1] = new Vehicle(101122, "Toyota Camry","Blue",60000,11000);
        vehicleInventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black",50000,9700);
        vehicleInventory[3] = new Vehicle(101124, "Honda Civic", "White",70000,7500);
        vehicleInventory[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicleInventory[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);


        //process loop
        while (running) {

            //prompt user
            System.out.println("What would you like to do?\n1 - List all vehicles\n2 - Search by make/model");

            //
            switch (getInput.nextInt()) {
                case 1:
                    listInventory();
                case 2:
                    searchMakeModel();
                case 3:
                    searchPriceRange();
                case 4:
                    searchColor();
                case 5:
                    addVehicle();
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Please select a valid option");
            }


        }


    }
}
