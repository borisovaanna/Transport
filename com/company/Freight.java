package com.company;

import java.util.Scanner;

public class Freight extends Land{
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public void displayOn1(){

        System.out.print(this.carrying);
    }
    public void carryOn(){
        System.out.print("Введите массу груза в т.: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        if (m <= carrying) {
            System.out.print("Грузовик загружен");
        }
        else {
            System.out.print("Вам нужен грузовик побольше");
        }
    }
}
