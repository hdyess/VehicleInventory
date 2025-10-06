package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;


public class Features {

    private static final Scanner getInput = new Scanner(System.in);

    //program feature functions
    //todo:most of these functions

    //lists all vehicles in vehicleInventory
    public static void listInventory() {

        System.out.println("\n--------------------");

        for (Vehicle car : Main.vehicleInventory) {
            if (car == null) {break;}
            System.out.printf("%s | Vehicle ID: %d\n", car.getMakeModel(), car.getVehicleId());
        }

        ConsoleHelper.promptForString("--------------------\nPress enter to continue");

    }

    //searches vehicleInventory by make and model
    public static void searchMakeModel() {

        String searchTerm = ConsoleHelper.promptForString("\nSearch make/model: \n");

        for (Vehicle car : Main.vehicleInventory) {
            if (car == null) {break;}
            if (car.getMakeModel().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.printf("\nMake and Model: %s\nVehicle ID: %d\nOdometer: %s\nColor: %s\nPrice: %.2f\n", car.getMakeModel(), car.getVehicleId(), car.getOdometerReading(), car.getColor(), car.getPrice());
            }
        }

    }

    //searches vehicles by price range
    public static void searchPriceRange() {

        float lowerBound = ConsoleHelper.promptForFloat("\nLower bound: \n");
        float upperBound = ConsoleHelper.promptForFloat("\nUpper bound: \n");

        for (Vehicle car : Main.vehicleInventory) {
            if (car == null) {break;}
            if (lowerBound <= car.getPrice() && car.getPrice() <= upperBound) {
                System.out.printf("\nMake and Model: %s\nVehicle ID: %d\nOdometer: %s\nColor: %s\nPrice: %.2f\n", car.getMakeModel(), car.getVehicleId(), car.getOdometerReading(), car.getColor(), car.getPrice());
            }
        }

    }

    //searches vehicles by color
    public static void searchColor() {

        String searchTerm = ConsoleHelper.promptForString("\nSearch color: \n");

        for (Vehicle car : Main.vehicleInventory) {
            if (car == null) {break;}
            if (car.getColor().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.printf("\nMake and Model: %s\nVehicle ID: %d\nOdometer: %s\nColor: %s\nPrice: %.2f\n", car.getMakeModel(), car.getVehicleId(), car.getOdometerReading(), car.getColor(), car.getPrice());
            }
        }

    }

    //adds a vehicle to vehicleInventory
    public static void addVehicle() {

        ConsoleHelper.promptForLong("Vehicle ID: ");


        ConsoleHelper.promptForString("Vehicle make/model: ");





    }


}
