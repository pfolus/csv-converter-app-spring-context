package com.codecool.scc.view;


import com.google.gson.Gson;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {

        Gson gson = new Gson();
        String json = gson.toJson(data);

        System.out.println(json);
    }
}
