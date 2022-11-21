package Viewer.Viewers;

import Analysis.AnalysisFacade;
import GUI.GUI;
import com.google.gson.JsonObject;

import javax.swing.*;
import java.awt.*;

public abstract class Viewer {

    public JPanel viewerPanel = new JPanel();

    public Viewer () {
        viewerPanel.setLayout(new GridLayout(0, 1));
    }

    public void add() {
        AnalysisFacade.getInstance().attach(this);
    }

    public void remove() {
        GUI.getInstance().mainFrame.removeViewer(viewerPanel);
        AnalysisFacade.getInstance().detach(this);
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel){}
}
