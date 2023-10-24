package org.example;

public class SensitiveData {
    private static String[] sensitiveData = {"login", "password", "url"};

    public static String[] getSensitiveData() {
        return sensitiveData;
    }
}
