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
            SimpleCsvConverter converter = new SimpleCsvConverter();

            switch (choice) {
                case JSON:
                    converter.convert(choice.path, choice.toString());
                    break;
                case XML:
                    converter.convert(choice.path, choice.toString());
                    break;
                case TABLE:
                    converter.convert(choice.toString());
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No input file defined");
        } catch (IllegalArgumentException e) {
            System.out.println("wrong parameter given");
        }
    }
}
