package com.filereader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class FileReader {
    MyApp app;

    public void setContent(String fileContent){
        /** My swing app is created **/
        app = new MyApp();
        app.sendText(fileContent);
    }
}
