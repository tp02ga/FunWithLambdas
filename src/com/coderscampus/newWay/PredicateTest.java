package com.coderscampus.newWay;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PredicateTest {

    @Test
    public void predicate_functional_interface() {

        List<String> names = 
                List.of("Adam", "Aaron", "Elon", 
                        "David", "Jane");

        names.stream()
                .filter((name) -> 
                        name.startsWith("E"))
                .forEach(System.out::println);

    }
}
