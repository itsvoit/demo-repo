package com.voit;

public class Test1 extends AbstractClass1 implements Interface1 {
    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void testInterface() {
        System.out.println("Interface");
    }

    @Override
    void testAbstract() {
        System.out.println("Abstract");
    }

}
