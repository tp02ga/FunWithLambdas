package com.coderscampus.newWay;

public class LambdaExample {

    public String addStrings() {
        LambdaInterface functionalInterface = (s1, s2) -> s1 + " " + s2;

        return functionalInterface.addStringsTogether("Hello there.", "I'm the new way");
    }

    public String addStrings(LambdaInterface lambdaInterface) {
        return lambdaInterface.addStringsTogether("Hello there.", "I'm the new way");
    }

}
