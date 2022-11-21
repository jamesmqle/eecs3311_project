package GUI.UIElements;
import GUI.GUI;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;
import java.util.Vector;

public class CustomComboBox<E> extends JComboBox {

    public CustomComboBox (Vector<E> items) {
        super(items);

        this.setMaximumRowCount(20);

        this.setBackground(GUI.getInstance().theme.getBorderColor());
        this.setForeground(GUI.getInstance().theme.getText2Color());

        this.setOpaque(true);
        this.setFocusable(false);
        this.setBorder(BorderFactory.createLineBorder(GUI.getInstance().theme.getBorderColor(), 5));

        var combo = this;
        this.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                return new BasicComboPopup(combo) {
                    {
                        this.setBorder(BorderFactory.createLineBorder(GUI.getInstance().theme.getBorderColor(), 2));
                    }
                };
            }
            @Override
            protected JButton createArrowButton() {
                BasicArrowButton result = new BasicArrowButton(BasicArrowButton.SOUTH, GUI.getInstance().theme.getMainColor(), GUI.getInstance().theme.getMainColor(), GUI.getInstance().theme.getText1Color(), GUI.getInstance().theme.getMainColor());
                result.setOpaque(true);
                return result;
            }
        });

        this.setRenderer(new ListCellRenderer<String>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                JLabel result = new JLabel(value);
                result.setOpaque(true);
                result.setBackground(isSelected ? GUI.getInstance().theme.getMainColor() : GUI.getInstance().theme.getBorderColor());
                result.setForeground(isSelected ? GUI.getInstance().theme.getText1Color() : GUI.getInstance().theme.getText2Color());
                return result;
            }
        });
    }

}
