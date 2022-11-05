package com.filereader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class MyApp {
    private static JPanel panel;
    private static JFrame frame;
    private static JTextField text1;
    private static JTextField text3;
    private static JButton button1;
    private static JButton button2;
    private static JTextArea text2;
    private static JTextField text4;
    private static JTextArea text5;
    private static String myValue;
    FileReader fr;

    public MyApp() {
        FileReader fr = new FileReader();
        frame = new JFrame("FileReader");
        panel = new JPanel();
        frame.setSize(1200, 500);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        text1 = new JTextField("Reading file Name annual.csv ");
        text1.setBounds(20, 30, 240, 30);
        panel.add(text1);

        button1 = new JButton("Click to read file");
        button1.setBounds(20, 90, 200, 20);
        panel.add(button1);

        text2 = new JTextArea();
        text2.setBounds(10, 150, 600, 100);
        panel.add(text2);

        text3 = new JTextField("File name to write ");
        text3.setBounds(650, 30, 240, 30);
        panel.add(text3);

        text4 = new JTextField();
        text4.setBounds(650, 60, 240, 30);
        panel.add(text4);

        text5 = new JTextArea();
        text5.setBounds(650, 150, 600, 100);
        panel.add(text5);
        text5.setLineWrap(true);

        button2 = new JButton("Click to write to file");
        button2.setBounds(650, 110, 200, 20);
        panel.add(button2);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = getValue();
                text2.setText(text);
            }

        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = text4.getText();
                /** mytext will get the parsed data written into the file **/
                String mytext = "";
                try {
                    mytext = createFile(filename);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                text5.setText(mytext);
            }

        });

    }

    public String createFile(String user) throws IOException {
        FileWriter fileWriter = new FileWriter(user);
        String[] parts = getValue().split("\n");
        String temp = "";
       /** add each line into string array **/
        for (int i = 0; i < 5; i++) {
            /** split the string and store in string array to obtain first 3 field **/
            String[] dummy = parts[i].split(",");
            for (int j = 0; j < 3; j++) {
                fileWriter.write(dummy[j]);
                temp = temp + dummy[j];
                if (j < 2) temp += ",";
            }
            temp = temp + "\n";
            fileWriter.write("\n");
        }
        fileWriter.close();
        return temp;
    }
/** to obtain the data from annual.csv **/
    public void sendText(String s) {
        this.myValue = s;
    }
/** sends the content of file to parse **/
    public String getValue() {
        return myValue;
    }

}
