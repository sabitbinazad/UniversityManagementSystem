package com.sabit.ums;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField uTF, uPTF, c, i, p;
    JButton b, e, f;
    Container v;
    JLabel background;

    public StudentRegistration() {
        JLabel na = new JLabel("Student Registration");
        na.setBounds(320, 80, 200, 50);
        na.setForeground(Color.RED);
        na.setFont(new Font("Arial", Font.BOLD, 20));
        
        JLabel first = new JLabel("First Name:");
        first.setBounds(250, 130, 200, 50);
        uTF = new JTextField();
        uTF.setBounds(320, 140, 200, 30);
        first.setForeground(Color.RED);

        JLabel last = new JLabel("Last Name:");
        last.setBounds(250, 190, 200, 50);
        uPTF = new JTextField();
        uPTF.setBounds(320, 200, 200, 30);
        last.setForeground(Color.RED);

        JLabel classn = new JLabel("Depart. Name:");
        classn.setBounds(235, 250, 200, 50);
        c = new JTextField();
        c.setBounds(320, 260, 200, 30);
        classn.setForeground(Color.RED);

        JLabel id = new JLabel("Id Number:");
        id.setBounds(250, 310, 200, 50);
        i = new JTextField();
        i.setBounds(320, 320, 200, 30);
        id.setForeground(Color.RED);

        JLabel phone = new JLabel("Pass Word:");
        phone.setBounds(245, 370, 200, 50);
        p = new JTextField();
        p.setBounds(320, 380, 200, 30);
        phone.setForeground(Color.RED);

        b = new JButton("Register");
        b.setBounds(350, 450, 120, 40);
        b.setBackground(Color.yellow);
        b.addActionListener(this);
        

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

        add(first);
        add(last);
        add(classn);
        add(id);
        add(phone);
        add(c);
        add(i);
        add(p);
        add(uTF);
        add(uPTF);
        add(b);
        add(na);

        add(background);

        v = this.getContentPane();
        v.setLayout(null);
        this.setTitle("Student Registration Page");
        this.setSize(800, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b) {
                setVisible(false);
                new StudentLogin();
                JOptionPane.showMessageDialog(null, "Register Successful");
            } else if (ae.getSource() == e) {
                setVisible(false);
                new Home();
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
