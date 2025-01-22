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

public class Help extends JFrame implements ActionListener {

    JTextField u;
    JButton b, e, f;
    Container v;
    JLabel background;

    public Help() {

        JLabel na = new JLabel("Please Write Your Problems Below");
        na.setBounds(235, 85, 400, 50);
        na.setForeground(Color.RED);
        na.setFont(new Font("Arial", Font.BOLD, 20));

        u = new JTextField();
        u.setBounds(247, 150, 300, 60);

        b = new JButton("Submit");
        b.setBounds(335, 250, 120, 40);
        b.setBackground(Color.YELLOW);
        b.addActionListener(this);
        e = new JButton("HOME");
        e.setBounds(50, 450, 120, 40);
        e.setBackground(Color.RED);
        e.addActionListener(this);

        f = new JButton("Exit");
        f.setBounds(620, 450, 120, 40);
        f.setBackground(Color.RED);
        f.addActionListener(this);

        ImageIcon backgroundImage = new ImageIcon("src/main/java/com/sabit/ums/hq720.jpg"); // Change path to your image
        Image img = backgroundImage.getImage();
        Image newImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH); // Scale image to fit container
        background = new JLabel(new ImageIcon(newImg));
        background.setBounds(0, 0, 800, 600);

        add(f);
        add(e);

        add(u);
        add(na);
        add(b);

        add(background);

        v = this.getContentPane();
        this.setResizable(false);
        this.setTitle("Help Page");
        this.setSize(800, 600);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b) {
                setVisible(false);
                new Home();
                JOptionPane.showMessageDialog(null, "Submit Successful");
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
