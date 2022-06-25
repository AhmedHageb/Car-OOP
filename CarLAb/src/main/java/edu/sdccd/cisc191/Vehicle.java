package edu.sdccd.cisc191;

public class Vehicle {
    private String manufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] option;

    public Vehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats,Option[] option)
    {
        this.manufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.option = option;
    }

    public String getManufacturerName()
    {return manufacturerName;}
    public int getMilesOnVehicle()
    {return milesOnVehicle;}
    public int getPrice()
    {return price;}
    public int getNumberOfSeats()
    {return numberOfSeats;}
    public Option[] getOptions()
    {return option;}
}
