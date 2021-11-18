package com.coderscampus.newWay;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

class LambdaExampleTest {

    Function<String, Integer> convertToInt = (value) -> Integer.parseInt(value);

    /**
     * Example of using the Function<T> FunctionalInterface
     */
    @Test
    public void functionInterfaceExample() {

        System.out.println(intConvert("14") + intConvert("20"));
    }

    private Integer intConvert(String valueToConvert) {
        return convertToInt.apply(valueToConvert);
    }

}
