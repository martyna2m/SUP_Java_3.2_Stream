package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DataConcealer {

    public static void concealSensitiveData(Map<String, String> map) {

        Map<String, String> mapCopy = new HashMap<>(map);
        SensitiveData sensitiveData = new SensitiveData();

        mapCopy.entrySet().stream()
                .filter(p -> Arrays.asList(sensitiveData.getSensitiveData()).contains(p.getKey()))
                .forEach(p -> p.setValue("******"));

        System.out.println(mapCopy.values());

    }
}
