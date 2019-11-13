package com.stackroute;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("calling with airtel");
    }

    @Override
    public void data() {
        System.out.println("browsing with airtel");
    }
}
