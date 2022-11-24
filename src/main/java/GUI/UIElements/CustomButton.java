package GUI.UIElements;

import GUI.GUIFacade;

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
        this.setBackground(GUIFacade.getInstance().theme.getMainColor());
        this.setForeground(GUIFacade.getInstance().theme.getText1Color());

        this.setOpaque(true);
        this.setBorderPainted(false);

        this.setFocusable(false);
        //Button hover effects
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                evt.getComponent().setBackground(GUIFacade.getInstance().theme.getText1Color());
                evt.getComponent().setForeground(GUIFacade.getInstance().theme.getMainColor());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                evt.getComponent().setBackground(GUIFacade.getInstance().theme.getMainColor());
                evt.getComponent().setForeground(GUIFacade.getInstance().theme.getText1Color());
            }
        });
    }
}
