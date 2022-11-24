package GUI;

import Authentication.AuthenticationFacade;
import GUI.UIElements.CustomButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;

public class LoginUI extends JFrame {

    private JLabel success;
    private JPasswordField passwordField;
    private JTextField usernameField;

    public LoginUI() {
        super("Login");

        String path = "src/main/resources/Icon.png";
        ImageIcon iconImg = new ImageIcon(path);
        super.setIconImage(iconImg.getImage());

        JPanel panel = new JPanel();

        super.add(panel);
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10,10,80,25);
        panel.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(100,10,165,25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,40,80,25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100,40,165,25);
        panel.add(passwordField);

        JButton button = new CustomButton("Submit");
        button.setBounds(10,75,100,25);
        button.addActionListener(this::actionPerformed);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(120,75,100,25);
        panel.add(success);
    }

    private void actionPerformed(ActionEvent e) {
        String user = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if(AuthenticationFacade.getInstance().authenticate(user,password)){
            success.setText("Successful!");

            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    GUIFacade.getInstance().closeLoginUI();
                    GUIFacade.getInstance().mainUI();
                }
            }, 1000);

        }else {
            success.setText("Login failed!");
        }
    }



}
