package Viewer.Viewers;

import Analysis.AnalysisFacade;
import GUI.GUI;
import com.google.gson.JsonObject;

import javax.swing.*;

public abstract class Viewer {

    public JPanel viewerPanel;

    public Viewer () {}

    public void remove() {
        GUI.getInstance().mainFrame.removeViewer(viewerPanel);
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel){}
}
