package com.company;

import java.util.Scanner;

public class Military extends Air{
    private String bailout;

    public String getBailout() {
        return bailout;
    }

    public void setBailout(String bailout) {
        this.bailout = bailout;
    }

    private int numOfRockets;

    public int getNumOfRockets() {
        return numOfRockets;
    }

    public void setNumOfRockets(int numOfRockets) {
        this.numOfRockets = numOfRockets;
    }

    @Override
    public void displayOn2(){
        System.out.print(this.bailout + " " + this.numOfRockets);
    }

    public void shot(){
        if (numOfRockets == 0){
            System.out.print("Боеприпасы отсутствуют");}
        else if (numOfRockets > 0){
            System.out.print("Ракета пошла…");}
        }

    public void catapult(){
        System.out.print("Введите кодовое слово для катапультирования: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        if (word.equals(bailout)) {
            System.out.print("Катапультирование прошло успешно");
        }
        else{
            System.out.print("У вас нет такой системы");
        }
    }

}
