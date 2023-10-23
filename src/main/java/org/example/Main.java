package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been found");

        String[] sensitiveKeys = {"login", "password", "url"};


        properties.entrySet().stream()
                .filter(p -> Arrays.asList(sensitiveKeys).contains(p.getKey()))
                .forEach(p -> p.setValue("******"));


        System.out.println(properties.values());

    }
}
