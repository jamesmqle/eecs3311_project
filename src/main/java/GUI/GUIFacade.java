package GUI;

import GUI.Themes.Theme;
import GUI.Themes.LightTheme;
import Viewer.ViewerFacade;

import javax.swing.*;

public class GUIFacade {

    public LoginUI loginFrame;
    public MainUI mainFrame;

    //Singleton
    private static final GUIFacade gui = new GUIFacade();
    private GUIFacade() {
        theme.setTheme(new LightTheme());
    }
    public static GUIFacade getInstance() {
        return gui;
    }

    public Theme theme = new Theme();

    public void mainUI() {
        mainFrame = new MainUI();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1250, 800);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public void loginUI(){
        loginFrame = new LoginUI();
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 150);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

    public void closeLoginUI() {
        loginFrame.setVisible(false);
        loginFrame.dispose();
    }

    public void refreshMainUI() {
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    public void rebuildMainUI() {
        mainFrame.getContentPane().removeAll();
        mainFrame.buildUI();

        ViewerFacade.getInstance().refreshViewers();

        refreshMainUI();
    }
}
