package com.codecool.scc.view;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        XStream xstream = new XStream(new DomDriver());

        xstream.alias("csv", List.class);
        xstream.alias("word", String.class);

        System.out.println(xstream.toXML(data));
    }
}
