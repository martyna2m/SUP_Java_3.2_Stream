package org.example;

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


//
//        List<String> notSensitiveList = properties.entrySet()
//                .stream()
//                .filter(p -> (!p.getKey().equals("login")) && (!p.getKey().equals("password")) && (!p.getKey().equals("url")))
//                .map(p-> p.getKey() + " = " + p.getValue()).toList();
//
//
//
//        List<String> sensitiveList = properties.keySet()
//                .stream()
//                .filter(p -> (p.equals("login")) || (p.equals("password")) || (p.equals("url")))
//                .map(p -> p + " = ******").toList();
//
//
//        List <String> finalList = Stream.concat(notSensitiveList.stream(),sensitiveList.stream()).toList();
//        System.out.println(finalList);
//

        //      System.out.println(finalList);


        properties.entrySet().stream()
                .filter(p -> (p.getKey().equals("login")) || (p.getKey().equals("password")) || (p.getKey().equals("url")))
                .forEach(p -> p.setValue("*******"));


        System.out.println(properties);


    }

}

