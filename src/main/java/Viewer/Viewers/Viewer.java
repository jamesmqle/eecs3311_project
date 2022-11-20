package Viewer.Viewers;

import GUI.GUI;

import javax.swing.*;

public abstract class Viewer {

    public JPanel viewerPanel;

    public Viewer () {}

    public void remove() {
        GUI.getInstance().mainFrame.removeViewer(viewerPanel);
    }

}
