package com.sabit.ums;

import javax.swing.*;

public class Ums {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Home();
        });
    }
}