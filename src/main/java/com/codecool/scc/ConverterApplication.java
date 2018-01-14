package com.codecool.scc;

public class ConverterApplication {

    public enum Option {JSON, XML}

    public static void main (String[] args) {

        try{
            Option choice = Option.valueOf(args[0]);

            switch (choice) {
                case JSON:
                    System.out.println("json");
                    break;
                case XML:
                    System.out.println("xml");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No input file defined");
        } catch (IllegalArgumentException e) {
            System.out.println("wrong parameter given");
        }
    }
}
