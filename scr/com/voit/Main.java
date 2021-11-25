package com.voit;

public class Main {
    public static void main(String[] args){
        /*System.out.println("Hello world!");
        Prostokat prostokat1 = new Prostokat(1, 1, 2, 2);
        Kolo kolo1 = new Kolo(1, 1, 2);

        prostokat1.wypisz();
        kolo1.wypisz();*/

        Test1 test = new Test1();
        test.test();
        test.testInterface();
        test.testAbstract();
        System.out.println();
        Interface1 interface1 = (Interface1) test;
        interface1.testInterface();
        System.out.println();
        AbstractClass1 abstractClass1 = (AbstractClass1) test;
        abstractClass1.testAbstract();
    }
}
