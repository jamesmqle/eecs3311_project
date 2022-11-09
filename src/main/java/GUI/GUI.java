package GUI;

import javax.swing.*;

public class GUI {

    JFrame loginFrame;
    JFrame mainFrame;

    private static final GUI gui = new GUI();
    private GUI() {

    }
    public static GUI getInstance() {
        return gui;
    }

    public void mainUI() {
        mainFrame = new MainUI();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(900, 600);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public void loginUI(){
        loginFrame = new LoginUI();
        loginFrame.setSize(300, 200);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

    public void closeLoginUI() {
        loginFrame.setVisible(false);
        loginFrame.dispose();
    }
}
