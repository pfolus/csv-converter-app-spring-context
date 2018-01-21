package com.codecool.scc.view;

import java.util.List;

public class TableOutputFormatter  implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {
        for(String[] line : data) {
            for(String word : line) {
                System.out.print(word + " | ");
            }
            System.out.println("");
        }
    }
}
