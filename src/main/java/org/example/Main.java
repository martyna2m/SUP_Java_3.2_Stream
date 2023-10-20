package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();
        properties.put("login", "Angelina");
        properties.put("password", "angelinaInHollywood123");
        properties.put("title", "Salt");
        properties.put("url", "www.angelina.hollywood");
        properties.put("errorMessage", "file has not been found");



        List<String> properties1 = properties.entrySet()
                .stream()
                .filter(p -> (!p.getKey().equals("login")) && (!p.getKey().equals("password")) && (!p.getKey().equals("url")))
                .map(p-> p.getKey() + " = " + p.getValue()).toList();



        List<String> properties2 = properties.entrySet()
                .stream()
                .filter(p -> (p.getKey().equals("login")) || (p.getKey().equals("password")) || (p.getKey().equals("url")))
                .map(p-> p.getKey() + " = ******").toList();



        List <String> finalList = Stream.concat(properties1.stream(),properties2.stream()).toList();
        System.out.println(finalList);



    }

}

