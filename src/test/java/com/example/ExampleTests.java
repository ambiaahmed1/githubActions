package com.example;

import com.intuit.karate.junit5.Karate;

public class ExampleTest {

    @Karate.Test
    Karate testExample() {
        return Karate.run("classpath:com/example/example.feature").relativeTo(getClass());
    }
}
