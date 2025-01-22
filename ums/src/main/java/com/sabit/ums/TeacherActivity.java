package com.sabit.ums;

import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;

public class TeacherActivity extends JFrame implements ActionListener {

    JButton s1, s2, s3, s4, s5, s6, e, f;
    JLabel background;
    Container v;

    public TeacherActivity() {

        s1 = new JButton("My Information");
        s1.setBounds(160, 100, 190, 40);
        s1.setBackground(Color.YELLOW);
        s1.addActionListener(this);

        s2 = new JButton("Salary & Bonus");
        s2.setBounds(160, 200, 190, 40);
        s2.setBackground(Color.YELLOW);
        s2.addActionListener(this);

        s3 = new JButton("Schedule");
        s3.setBounds(160, 300, 190, 40);
        s3.setBackground(Color.YELLOW);
        s3.addActionListener(this);

        s4 = new JButton("My Courses");
        s4.setBounds(450, 100, 190, 40);
        s4.setBackground(Color.YELLOW);
        s4.addActionListener(this);

        s5 = new JButton("Academic Exprience");
        s5.setBounds(450, 200, 190, 40);
        s5.setBackground(Color.YELLOW);
        s5.addActionListener(this);

        s6 = new JButton("Learning");
        s6.setBounds(450, 300, 190, 40);
        s6.setBackground(Color.YELLOW);
        s6.addActionListener(this);

        e = new JButton("Previous");
        e.setBounds(50, 450, 120, 40);
        e.setBackground(Color.RED);
        e.addActionListener(this);

        f = new JButton("Exit");
        f.setBounds(620, 450, 120, 40);
        f.setBackground(Color.RED);
        f.addActionListener(this);

        ImageIcon backgroundImage = new ImageIcon("src/main/java/com/sabit/ums/eng7.jpg"); // Change path to your image
        Image img = backgroundImage.getImage();
        Image newImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH); // Scale image to fit container
        background = new JLabel(new ImageIcon(newImg));
        background.setBounds(0, 0, 800, 600);

        add(f);
        add(e);

        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);
        add(s6);

        add(background);

        v = this.getContentPane();
        v.setLayout(null); // Set layout to null for absolute positioning
        this.setTitle("School Management System");
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
                new TeacherLogin();
            } else if (ae.getSource() == s1) {
                setVisible(false);
                new TMyInformation();
            } else if (ae.getSource() == s2) {
                setVisible(false);
                new TSalary();
            } else if (ae.getSource() == s3) {
                setVisible(false);
                new TSchedule();
            } else if (ae.getSource() == s4) {
                setVisible(false);
                new TCourses();
            } else if (ae.getSource() == s5) {
                setVisible(false);
                new TAcademic();
            } else if (ae.getSource() == s6) {
                setVisible(false);
                new TLearning();
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

