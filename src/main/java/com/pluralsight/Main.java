package com.pluralsight;

public class Main {

    public static Vehicle[] vehicleInventory = new Vehicle[20];


    //actual program with hard coded stuff
    public static void main(String[] args) {

        //int vehicleCount;

        //preload vehicle inventory w/ sample data
        vehicleInventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicleInventory[1] = new Vehicle(101122, "Toyota Camry","Blue",60000,11000);
        vehicleInventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black",50000,9700);
        vehicleInventory[3] = new Vehicle(101124, "Honda Civic", "White",70000,7500);
        vehicleInventory[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicleInventory[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);


        //process loop
        boolean running = true;

        while (running) {

            // todo: this feels like it can be made less bad
            //string in switch case is super long and bad, maybe promptForString can be condensed
            switch (ConsoleHelper.promptForString("\nWhat would you like to do?\n\n--------------------\n1, l - List all vehicles\n2, m - Search by make/model\n3, r - Search by price range\n4, c - Search by color\n5, a - Add a vehicle\n6, q - Quit\n--------------------\n").toLowerCase()) {
                case "1": case "l":
                    Features.listInventory();
                    break;
                case "2": case "m":
                    Features.searchMakeModel();
                    break;
                case "3": case "r":
                    Features.searchPriceRange();
                    break;
                case "4": case "c":
                    Features.searchColor();
                    break;
                case "5": case "a":
                    Features.addVehicle();
                    break;
                case "6": case "q":
                    running = false;
                    break;
                default:
                    System.out.println("\nPlease select a valid option");
            }


        }


    }
}
