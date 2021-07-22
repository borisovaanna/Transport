package com.company;

public class Land extends Transport{
    private int numOfWheels;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    private int fuelCons;

    public int getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(int fuelCons) {
        this.fuelCons = fuelCons;
    }

    public void displayOn1(){
        System.out.print(this.numOfWheels + " " + this.fuelCons);
    }
    }
