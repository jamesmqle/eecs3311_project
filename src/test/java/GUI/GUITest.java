package GUI;

import GUI.Themes.DarkTheme;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GUITest {

    @BeforeAll
    public static void setUp() {
        GUIFacade.getInstance().mainUI();
    }

    @Test
    public void TestTheme1() {
        GUIFacade.getInstance().theme.setTheme(new DarkTheme());

        assertEquals(new Color(43, 43, 43), GUIFacade.getInstance().theme.getBackgroundColor());
    }

    @Test
    public void TestTheme2() {
        GUIFacade.getInstance().theme.setTheme(new DarkTheme());
        GUIFacade.getInstance().theme.toggleTheme();

        assertEquals(new Color(244, 244, 244), GUIFacade.getInstance().theme.getBackgroundColor());
    }

    @Test
    public void TestTheme3() {
        GUIFacade.getInstance().theme.toggleTheme();

        assertEquals(new Color(43, 43, 43), GUIFacade.getInstance().theme.getBackgroundColor());
    }

}
