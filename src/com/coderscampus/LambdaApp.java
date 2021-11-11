package com.coderscampus;

import com.coderscampus.newWay.LambdaExample;
import com.coderscampus.oldWay.NonLambdaExample;

public class LambdaApp {

    public static void main(String[] args) {
        NonLambdaExample oldInterfaceExample = new NonLambdaExample();
        String addedStrings = oldInterfaceExample.addStrings();
        System.out.println(addedStrings);

        LambdaExample lambdaExample = new LambdaExample();
        addedStrings = lambdaExample.addStrings();
        System.out.println(addedStrings);
    }

}
