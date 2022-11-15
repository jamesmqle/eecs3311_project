package GUI.UIElements;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;
import java.util.Vector;

public class CustomComboBox<E> extends JComboBox {

    private Color mainColor = new Color(22, 168, 247);
    private Color borderColor = Color.WHITE;

    public CustomComboBox (Vector<E> items) {
        super(items);

        this.setMaximumRowCount(20);

        this.setBackground(Color.white);

        this.setOpaque(true);
        this.setFocusable(false);
        this.setBorder(BorderFactory.createLineBorder(borderColor, 5));

        var combo = this;
        this.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                return new BasicComboPopup(combo) {
                    {
                        this.setBorder(BorderFactory.createLineBorder(borderColor, 2));
                    }
                };
            }
            @Override
            protected JButton createArrowButton() {
                BasicArrowButton result = new BasicArrowButton(BasicArrowButton.SOUTH, mainColor, mainColor, Color.WHITE, mainColor);
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
                result.setBackground(isSelected ? mainColor : Color.WHITE);
                result.setForeground(isSelected ? Color.WHITE : Color.BLACK);
                return result;
            }
        });
    }

}
