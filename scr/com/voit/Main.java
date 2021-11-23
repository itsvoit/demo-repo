package com.voit;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        Prostokat prostokat1 = new Prostokat(1, 1, 2, 2);
        Kolo kolo1 = new Kolo(1, 1, 2);

        prostokat1.wypisz();
        kolo1.wypisz();
    }
}
