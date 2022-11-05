package com.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("annual.csv");
        Scanner scan = new Scanner(file);
        int i = 0;
        String fileContent = " ";
        while (i < 5) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
            i++;
        }
        FileReader fr = new FileReader();
        fr.setContent(fileContent);
    }

}

