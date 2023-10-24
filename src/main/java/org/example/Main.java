package org.example;

public class Main {
    public static void main(String[] args) {

        Properties properties = new Properties();

        DataConcealer.concealSensitiveData(properties.getProperties());

    }
}
