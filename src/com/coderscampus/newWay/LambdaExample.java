package com.coderscampus.newWay;

public class LambdaExample {

    public String addStrings() {
        LambdaInterface functionalInterface = (s1, s2) -> s1 + " " + s2;

        return functionalInterface.addStringsTogether("Hello there.", "I'm the new way");
    }
}
