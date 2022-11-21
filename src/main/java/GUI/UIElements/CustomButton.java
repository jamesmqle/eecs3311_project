package GUI.UIElements;

import GUI.GUI;

import javax.swing.*;

public class CustomButton extends JButton {

    public CustomButton (String text) {
        super(text);

        custom();
    }

    public CustomButton (Icon icon) {
        super(icon);

        custom();
    }

    private void custom() {
        this.setBackground(GUI.getInstance().theme.getMainColor());
        this.setForeground(GUI.getInstance().theme.getText1Color());

        this.setOpaque(true);
        this.setBorderPainted(false);

        this.setFocusable(false);
        //Button hover effects
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evt.getComponent().setBackground(GUI.getInstance().theme.getText1Color());
                evt.getComponent().setForeground(GUI.getInstance().theme.getMainColor());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                evt.getComponent().setBackground(GUI.getInstance().theme.getMainColor());
                evt.getComponent().setForeground(GUI.getInstance().theme.getText1Color());
            }
        });
    }
}
