package ru.geekbrains.Lesson;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        setVisible(true);
        setLocation(550,250);
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(1,2);
        JPanel panel = new JPanel(layout);
        JButton btn1 = new JButton("смайл");
        panel.add(btn1);
        JButton btn2 = new JButton("выход");
        panel.add(btn2);
        add(panel, BorderLayout.SOUTH);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Smile");
            }
        });

    }

}
