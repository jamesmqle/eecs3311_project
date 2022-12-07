package GUI;

import Authentication.AuthenticationFacade;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginGUITest extends JFrame {

    private static LoginUI loginUI;

    @BeforeAll
    public static void setUp(){
        loginUI = new LoginUI();
        GUIFacade.getInstance().loginUI();
    }

    @Test
    public void TestLoginUIDimensions(){
        assertEquals(300,GUIFacade.getInstance().loginFrame.getWidth());
        assertEquals(150,GUIFacade.getInstance().loginFrame.getHeight());
    }

    @Test
    public void TestLoginUIClass(){
        assertEquals(LoginUI.class,loginUI.getClass());
    }
}
