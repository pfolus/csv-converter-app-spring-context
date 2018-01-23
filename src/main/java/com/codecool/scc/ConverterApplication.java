package com.codecool.scc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;

public class ConverterApplication {

    public enum Option {JSON, XML, TABLE}

    public static void main (String[] args) {

        try {

            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
            SimpleCsvConverter converter = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter");

            Option choice;
            if (args.length == 1) {
                choice = Option.TABLE;
            } else {
                choice = Option.valueOf(args[0]);
            }
            File file = new File(args[args.length - 1]);

            switch (choice) {
                case JSON:
                    converter.convert(file, choice);
                    break;
                case XML:
                    converter.convert(file, choice);
                    break;
                case TABLE:
                    converter.convert(file);
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No input file defined");
        } catch (IllegalArgumentException e) {
            System.out.println("wrong parameter given");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
