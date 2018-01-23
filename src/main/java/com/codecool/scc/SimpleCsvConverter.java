package com.codecool.scc;

import com.codecool.scc.view.OutputFormatter;
import com.codecool.scc.view.TableOutputFormatter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class SimpleCsvConverter {

    FileReader reader;
    OutputFormatterFactory factory;

    public SimpleCsvConverter(FileReader reader, OutputFormatterFactory factory){

        this.reader = reader;
        this.factory = factory;
    }

    public void convert(File file, ConverterApplication.Option outputFormat) throws FileNotFoundException {
        List<String[]> data = reader.readData(file);
        OutputFormatter outputFormatter = factory.createByFormat(outputFormat);
        outputFormatter.printToConsole(data);
    }

    public void convert(File file ) throws FileNotFoundException {
        List<String[]> data = reader.readData(file);
        OutputFormatter outputFormatter = new TableOutputFormatter();
        outputFormatter.printToConsole(data);
    }
}
