package com.coderscampus.oldWay;

public class NonLambdaExample {

    public String addStrings() {
        NonLambdaInterface oldInterface = new NonLambdaInterface() {

            @Override
            public String addStringsTogether(String s1, String s2) {
                return s1 + " " + s2;
            }
        };

        return oldInterface.addStringsTogether("Hello there.", "I'm the old way");
    }
}
