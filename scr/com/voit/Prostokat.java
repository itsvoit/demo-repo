package com.voit;

public class Prostokat {
    private int x;
    private int y;
    private int xLength;
    private int yLength;

    Prostokat (int x, int y, int xLength, int yLength){
        this.x = x;
        this.y = y;
        this.xLength = xLength;
        this.yLength = yLength;
    }

    public int pole(){
        return xLength * yLength;
    }

    public int obwod(){
        return 2 * (xLength + yLength);
    }

    public void wypisz(){
        System.out.println("Pole prostokatu: " + pole());
        System.out.println("Obwod prostokatu: " + obwod());
    }
}
