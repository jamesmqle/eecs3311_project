package Viewer;

import GUI.GUI;

import javax.swing.*;

public abstract class Viewer {

    JPanel viewerPanel;

    public Viewer () {}

    public void remove() {
        GUI.getInstance().mainFrame.removeViewer(viewerPanel);
    }

}
