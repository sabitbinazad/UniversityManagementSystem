package com.sabit.ums;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TeacherLogin extends JFrame implements ActionListener {

    JTextField u, v;
    JButton b, e, f;
    Container x;
    JLabel background;

    public TeacherLogin() {
        JLabel na = new JLabel("Teacher Login");
        na.setBounds(340, 85, 200, 50);
        na.setForeground(Color.RED);
        na.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel id = new JLabel("Id Number:");
        id.setBounds(250, 140, 200, 50);
        id.setForeground(Color.RED);
        u = new JTextField();
        u.setBounds(320, 150, 200, 30);

        JLabel pass = new JLabel("Password:");
        pass.setBounds(250, 210, 200, 50);
        pass.setForeground(Color.RED);

        e = new JButton("Previous");
        e.setBounds(50, 450, 120, 40);
        e.setBackground(Color.RED);
        e.addActionListener(this);

        f = new JButton("Exit");
        f.setBounds(620, 450, 120, 40);
        f.setBackground(Color.RED);
        f.addActionListener(this);

        ImageIcon backgroundImage = new ImageIcon("src/main/java/com/sabit/ums/Admission Fest.jpg"); // Change path to your image
        Image img = backgroundImage.getImage();
        Image newImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH); // Scale image to fit container
        background = new JLabel(new ImageIcon(newImg));
        background.setBounds(0, 0, 800, 600);

        add(f);
        add(e);
        v = new JTextField();
        v.setBounds(320, 220, 200, 30);

        b = new JButton("Login");
        b.setBounds(375, 285, 80, 30);
        b.setBackground(Color.yellow);
        b.addActionListener(this);

        add(na);
        add(id);
        add(u);

        add(b);
        add(pass);
        add(v);

        add(background);

        x = this.getContentPane();
        this.setResizable(false);
        this.setTitle("Teacher Login Page");
        this.setSize(800, 600);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b) {
                String userName = u.getText();
                String userPass = v.getText();

                if (userName.equals("t") && userPass.equals("2")) {
                    setVisible(false);
                    new TeacherActivity();
                    JOptionPane.showMessageDialog(null, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
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
