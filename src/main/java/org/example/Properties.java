package org.example;

import java.util.Map;

public class Properties {
    private Map<String, String> propertiesSet = Map.of(
            "login", "Angelina",
            "password", "angelinaInHollywood123",
            "title", "Salt",
            "url", "www.angelina.hollywood",
            "errorMessage", "file has not been found");

    public Map<String, String> getProperties() {
        return propertiesSet;
    }
}



