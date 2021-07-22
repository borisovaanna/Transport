package com.company;

import java.util.Scanner;

public class Civil extends Air{
    private int numOfPass;

    public int getNumOfPass() {
        return numOfPass;
    }

    public void setNumOfPass(int numOfPass) {
        this.numOfPass = numOfPass;
    }

    private String busClass;

    public String getBusClass() {
        return busClass;
    }

    public void setBusClass(String busClass) {
        this.busClass = busClass;
    }

    @Override
    public void displayOn2(){
        System.out.print(this.numOfPass + " " + this.busClass);
    }

    public void passOn(){
        System.out.print("Введите кол-во пассажиров.: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= numOfPass) {
            System.out.print("Самолёт загружен");
        }
        else {
            System.out.print("Вам нужен самолёт побольше");
        }
    }
}
