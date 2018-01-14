package com.codecool.scc;

public class ConverterApplication {

    public enum Option {
        JSON, XML, TABLE;
        String path = "";
    }

    public static void main (String[] args) {

        try{
            Option choice;
            if(args.length == 1) {
                choice = Option.TABLE;
            } else {
                choice = Option.valueOf(args[0]);
            }
            choice.path = args[args.length -1];
            switch (choice) {
                case JSON:
                    System.out.println(choice.path);
                    break;
                case XML:
                    System.out.println(choice.path);
                    break;
                case TABLE:
                    System.out.println(choice.path);
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No input file defined");
        } catch (IllegalArgumentException e) {
            System.out.println("wrong parameter given");
        }
    }
}
