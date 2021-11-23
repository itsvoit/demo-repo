package com.voit;

public class Kolo {
    private int x;
    private int y;
    private int r;

    public Kolo(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double pole(){
        return Math.PI * Math.pow(r, 2);
    }

    public double obwod(){
        return Math.PI * 2 * r;
    }

    public void wypisz(){
        System.out.println("Pole kola: " + pole());
        System.out.println("Obwod kola: " + obwod());
    }
}
