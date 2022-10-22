package GUI;

import Authentication.AuthenticationFacade;
import DataFetcher.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    private static final GUI gui = new GUI();
    private GUI() {

    }
    public static GUI getInstance() {
        return gui;
    }

    public void loginUI(){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);
        userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        button = new JButton("Submit!");
        button.setBounds(10,80,80,25);
        button.addActionListener(this::actionPerformed);
        panel.add(button);
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        frame.setVisible(true);
        frame.repaint();
    }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(AuthenticationFacade.getInstance().authenticate(user,password)){
            success.setText("Login successful!");
        }else {
            success.setText("Login failed!");
        }
    }


}
