package com.codecool.scc;

import com.codecool.scc.view.JsonOutputFormatter;
import com.codecool.scc.view.OutputFormatter;
import com.codecool.scc.view.TableOutputFormatter;
import com.codecool.scc.view.XmlOutputFormatter;
import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {

    public OutputFormatter createByFormat(ConverterApplication.Option outputFormat) {

        if(outputFormat.name().equals("XML")) {
            return new XmlOutputFormatter();
        } else if (outputFormat.name().equals("JSON")) {
            return new JsonOutputFormatter();
        } return new TableOutputFormatter();
    }
}
