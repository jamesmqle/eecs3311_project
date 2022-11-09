package GUI;

import Authentication.AuthenticationFacade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;

public class LoginUI extends JFrame {

    JLabel success;
    JPasswordField passwordText;
    JTextField userText;

    public LoginUI() {
        super("Login");

        String path = "src/main/resources/Icon.png";
        ImageIcon iconImg = new ImageIcon(path);
        super.setIconImage(iconImg.getImage());

        JPanel panel = new JPanel();
        panel.setSize(300,200);

        super.add(panel);
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton button = new JButton("Submit!");
        button.setBounds(10,80,80,25);
        button.addActionListener(this::actionPerformed);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
    }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = new String(passwordText.getPassword());

        if(AuthenticationFacade.getInstance().authenticate(user,password)){
            success.setText("Login successful!");

            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    GUI.getInstance().closeLoginUI();
                    GUI.getInstance().mainUI();
                }
            }, 1000);

        }else {
            success.setText("Login failed!");
        }
    }



}
