package com.stackroute.junitdemo;

public class StringConverter {
    public  String concatAndToUpperCase(String msg1, String msg2){
        if(msg1==null || msg2==null)
        {
            return "PLease enter normal value";
        }
        String concatedString = msg1.concat(msg2);
        return concatedString.toUpperCase();
    }
}
