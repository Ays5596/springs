package com.stackroute;

public class Jio {
    private int jioNum;
    private int imei;

    public Jio(int jioNum, int imei) {
        this.jioNum = jioNum;
        this.imei = imei;
    }

    public void disp(){
        System.out.println("NUmber is "+jioNum +" and "+imei);
    }
}
