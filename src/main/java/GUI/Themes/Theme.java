package GUI.Themes;

import GUI.GUI;
import java.awt.*;

public class Theme {

    private Theme currentTheme;

    protected Color mainColor;
    protected Color borderColor;
    protected Color backgroundColor;
    protected Color text1Color;
    protected Color text2Color;

    public Theme() {}

    public void setTheme(Theme theme){
        currentTheme = theme;
        if(GUI.getInstance() != null)
            GUI.getInstance().rebuildMainUI();
    }

    public void toggleTheme() {
        if(currentTheme instanceof LightTheme)
            setTheme(new DarkTheme());
        else
            setTheme(new LightTheme());
    }

    public Color getMainColor() {
        return currentTheme.mainColor;
    }

    public Color getBorderColor() {
        return currentTheme.borderColor;
    }

    public Color getBackgroundColor() {
        return currentTheme.backgroundColor;
    }

    public Color getText1Color() {
        return currentTheme.text1Color;
    }

    public Color getText2Color() {
        return currentTheme.text2Color;
    }

}
