package com.coderscampus;

import com.coderscampus.newWay.LambdaExample;
import com.coderscampus.oldWay.NonLambdaExample;

public class LambdaApp {

    public static void main(String[] args) {
        NonLambdaExample oldInterfaceExample = new NonLambdaExample();
        String addedStrings = oldInterfaceExample.addStrings();
        System.out.println(addedStrings);

        // Lambda Example 1, without passing FunctionalInterface as a parameter
        LambdaExample lambdaExample = new LambdaExample();
        addedStrings = lambdaExample.addStrings();
        System.out.println(addedStrings);

        // Lambda Example 2, passing FunctionalInterface as a parameter
        addedStrings = lambdaExample.addStrings((s1, s2) -> s1 + " " + s2);
        System.out.println(addedStrings);

    }

}
