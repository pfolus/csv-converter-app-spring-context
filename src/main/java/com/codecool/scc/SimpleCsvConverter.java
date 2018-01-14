package com.codecool.scc;

public class SimpleCsvConverter {

    public void convert(String file, String outputFormat) {
        System.out.println(String.format("i convert CSV to output format %s", outputFormat));
    }

    public void convert(String file) {
        System.out.println("i convert CSV to default output format");
    }
}
