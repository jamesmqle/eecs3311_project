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

    public void add(boolean refresh) {
        GUI.getInstance().mainFrame.addViewer(viewerPanel, refresh);
        AnalysisFacade.getInstance().attach(this);
    }

    public void remove(boolean refresh) {
        GUI.getInstance().mainFrame.removeViewer(viewerPanel, refresh);
        AnalysisFacade.getInstance().detach(this);
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel){}
}
