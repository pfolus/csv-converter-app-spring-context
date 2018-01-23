package com.codecool.scc;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class FileReader {

    public List<String[]> readData(File file) throws FileNotFoundException {

        List<String[]> wordsList = new ArrayList<>();
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {

            wordsList.add(sc.nextLine().split(","));
        }
        sc.close();

        return wordsList;
    }
}
