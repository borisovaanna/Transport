package com.company;

import java.util.Scanner;

public class Passenger extends Land{
    private String bodyType;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private double dist;
    private double f;

    @Override
 public void displayOn1(){
        System.out.print(this.bodyType + " " + this.amount);
    }
    private double fuel(){
        f = dist * getFuelCons() / 100;
        return f;
    }

    public void distance(){
        System.out.print("Введите время в ч.: ");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        dist = t * getMaxSpeed();
        System.out.print("За время " + t + " ч. автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет " + dist + " км." + " и израсходует " + this.fuel() + " л. топлива");
    }

}
