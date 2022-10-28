package com.swingapp;
import com.swingapp.*;
import javax.swing.*;
import java.awt.*;
import  java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel label1;
    private static JLabel label2;
    private static JLabel label3;
    private static JLabel label4;
    private static JTextField text1;
    private static JTextField text2;
    private static JTextField text3;
    private static JTextField text4;
    private static JButton button;
    private JPanel panel1;

    WeightedGrade wg;

    public App() {
        wg = new WeightedGrade();
        frame = new JFrame("App");
        panel = new JPanel();
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        label1 = new JLabel("Total Assignment Point");
        label1.setBounds(10,20,220,25);
        panel.add(label1);

        label2 = new JLabel("Earned Points");
        label2.setBounds(280,20,220,25);
        panel.add(label2);

        label3 = new JLabel("Percentage of class");
        label3.setBounds(10,100,220,25);
        panel.add(label3);

        label4 = new JLabel("Weighted Score");
        label4.setBounds(190,240,220,25);
        panel.add(label4);

        text1 = new JTextField();
        text1.setBounds(10,60,220, 25);
        panel.add(text1);

        text2 = new JTextField();
        text2.setBounds(280,60,220, 25);
        panel.add(text2);

        text3 = new JTextField();
        text3.setBounds(10,130,220, 25);
        panel.add(text3);

        text4 = new JTextField();
        text4.setBounds(190,270,220, 25);
        panel.add(text4);

        button = new JButton("Click to calculate");
        button.setBounds(190,180,300,34);
        panel.add(button);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setBackground(Color.cyan);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value1 = text1.getText();
                String value2 = text2.getText();
                String value3 = text3.getText();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int c = Integer.parseInt(value3);
                wg.calculateGrade(a,b,c);
                double d = wg.getGrade();
                text4.setText(String.valueOf(d));
            }
        });

        frame.setVisible(true);
    }
}



