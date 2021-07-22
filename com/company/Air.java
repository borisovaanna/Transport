package com.company;

public class Air extends Transport{
    private int span;

    public int getSpan() {
        return span;
    }

    public void setSpan(int span) {
        this.span = span;
    }

    private int minL;

    public int getMinL() {
        return minL;
    }

    public void setMinL(int minL) {
        this.minL = minL;
    }

    public void displayOn2(){
        System.out.print(this.span + " " + this.minL);
    }
}
