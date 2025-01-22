package com.sabit.ums;

import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;



public class Home extends JFrame implements ActionListener {

    JButton s1, s2, t1, t2, e, f;
    JLabel background;
    Container v;

    public Home() {

        s1 = new JButton("Student Registation");
        s1.setBounds(160, 150, 190, 40);
        s1.setBackground(Color.YELLOW);
        s1.addActionListener(this);

        s2 = new JButton("Student Login");
        s2.setBounds(160, 280, 190, 40);
        s2.setBackground(Color.YELLOW);
        s2.addActionListener(this);

        t1 = new JButton("Teacher Registation");
        t1.setBounds(450, 150, 190, 40);
        t1.setBackground(Color.YELLOW);
        t1.addActionListener(this);

        t2 = new JButton("Teacher Login");
        t2.setBounds(450, 280, 190, 40);
        t2.setBackground(Color.YELLOW);
        t2.addActionListener(this);

        e = new JButton("Help Line");
        e.setBounds(50, 450, 120, 40);
        e.setBackground(Color.RED);
        e.addActionListener(this);

        f = new JButton("Exit");
        f.setBounds(620, 450, 120, 40);
        f.setBackground(Color.RED);
        f.addActionListener(this);

        ImageIcon backgroundImage = new ImageIcon("src/main/java/com/sabit/ums/cub-1.jpeg"); // Change path to your image
        Image img = backgroundImage.getImage();
        Image newImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH); // Scale image to fit container
        background = new JLabel(new ImageIcon(newImg));
        background.setBounds(0, 0, 800, 600);

        add(f);
        add(e);

        add(s1);
        add(s2);
        add(t1);
        add(t2);

        add(background);

        v = this.getContentPane();
        v.setLayout(null); // Set layout to null for absolute positioning
        this.setTitle("University Management System");
        this.setSize(800, 600);
        this.setResizable(false); // Prevent resizing
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == e) {
                setVisible(false);
                new Help();
            } else if (ae.getSource() == s1) {
                setVisible(false);
                new StudentRegistration();
            } else if (ae.getSource() == s2) {
                setVisible(false);
                new StudentLogin();
            } else if (ae.getSource() == t1) {
                setVisible(false);
                new TeacherRegistration();
            } else if (ae.getSource() == t2) {
                setVisible(false);
                new TeacherLogin();
            } else if (ae.getSource() == f) {
                int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
                if (a == JOptionPane.YES_OPTION) {
                    setVisible(false);
                    System.exit(0);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
