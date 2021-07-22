package com.company;

public class Main {

    public static void main(String[] args) {
    Transport transport = new Transport();
	Land auto = new Land();
	Passenger train = new Passenger();
	Air fly = new Air();
	Civil airoplan = new Civil();
	Military helicopter = new Military();
	Freight track = new Freight();
	    transport.setCapacity(180);
	    helicopter.setCapacity(220);
	    helicopter.setNumOfRockets(13);
	    helicopter.setBailout("птичка");
        auto.setNumOfWheels(4);
        auto.setFuelCons(50);
        track.setCarrying(256);
        train.setMaxSpeed(300);
        train.setBrand("audi");
        train.setNumOfWheels(8);
        train.setFuelCons(150);
        train.setBodyType("steel");
        train.setAmount(100);
        airoplan.setNumOfPass(150);
        fly.setSpan(12);
        fly.setMinL(175);
        airoplan.setBusClass("эконом");
        //helicopter.newCapacity();
        //auto.displayOn1();
        //System.out.println();
        //train.displayOn1();
        //System.out.println();
        //track.displayOn1();
        //train.distance();
        //track.carryOn();
        //fly.displayOn2();
        //System.out.println();
        //airoplan.displayOn2();
        //System.out.println();
        //helicopter.displayOn2();
        //airoplan.passOn();
        //helicopter.shot();
        helicopter.catapult();
    }
}
