package GUI.UIElements;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {

    private Color mainColor = new Color(22, 168, 247);

    public CustomButton (String text) {
        super(text);

        custom();
    }

    public CustomButton (Icon icon) {
        super(icon);

        custom();
    }

    private void custom() {
        this.setBackground(mainColor);
        this.setForeground(Color.WHITE);

        this.setOpaque(true);
        this.setBorderPainted(false);

        this.setFocusable(false);
        //Button hover effects
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evt.getComponent().setBackground(Color.WHITE);
                evt.getComponent().setForeground(mainColor);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                evt.getComponent().setBackground(mainColor);
                evt.getComponent().setForeground(Color.WHITE);
            }
        });
    }
}
