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

public class TMyInformation extends JFrame implements ActionListener {

    JButton e, f;
    Container x;
    JLabel background;

    public TMyInformation() {
        JLabel na = new JLabel("Here is all Information about the page *-*.");
        na.setBounds(20, 120, 750, 60);
        na.setForeground(Color.RED);
        na.setFont(new Font("Arial", Font.BOLD, 38));

        e = new JButton("Previous");
        e.setBounds(50, 450, 120, 40);
        e.setBackground(Color.RED);
        e.addActionListener(this);

        f = new JButton("Exit");
        f.setBounds(620, 450, 120, 40);
        f.setBackground(Color.RED);
        f.addActionListener(this);

        ImageIcon backgroundImage = new ImageIcon("src/main/java/com/sabit/ums/MEET THE LEADERS (3).jpg"); // Change path to your image
        Image img = backgroundImage.getImage();
        Image newImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH); // Scale image to fit container
        background = new JLabel(new ImageIcon(newImg));
        background.setBounds(0, 0, 800, 600);

        add(f);
        add(e);
        add(na);



        add(background);

        x = this.getContentPane();
        //x.setBackground(Color.ORANGE);
        this.setTitle("Student Login Page");
        this.setSize(800, 600);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
          if (ae.getSource() == e) {
                setVisible(false);
                new TeacherActivity();
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


