package com.pluralsight;

public class Vehicle {

    //attributes
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    //constructor no args
    public Vehicle() {
        this.vehicleId = 0;
        this.makeModel = "";
        this.color = "";
        this.odometerReading = 0;
        this.price = 0.0f;
    }

    //constructor with args
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    //getters setters
    public long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(long newVehicleID) {
        this.vehicleId = newVehicleID;
    }


    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String newMakeModel) {
        this.makeModel = newMakeModel;
    }


    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }


    public int getOdometerReading() {
        return odometerReading;
    }
    public void setOdometerReading(int newOdometerReading) {
        this.odometerReading = newOdometerReading;
    }


    public float getPrice() {
        return price;
    }
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }


}
