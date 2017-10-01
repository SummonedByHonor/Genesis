package com.view;

import javax.swing.*;

public class MainIniCiewClass extends JFrame {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainView mainView = new MainView();
                mainView.setVisible(true);
                mainView.getMoviesFromDataBase();
            }
        });
    }

}
