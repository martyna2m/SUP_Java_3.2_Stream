package org.example;

public class Main {
    public static void main(String[] args) {
        DataConcealer dataConcealer = new DataConcealer();
        Properties properties = new Properties();

        dataConcealer.concealSensitiveData(properties.getProperties());

    }
}
