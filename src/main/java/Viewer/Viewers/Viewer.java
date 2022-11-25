package Viewer.Viewers;

import Analysis.AnalysisFacade;
import GUI.GUIFacade;
import com.google.gson.JsonObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class Viewer {

    public JPanel viewerPanel = new JPanel();

    public Viewer () {
        viewerPanel.setLayout(new GridLayout(0, 1));
    }

    public void add(boolean refresh) {
        GUIFacade.getInstance().mainFrame.addViewer(viewerPanel, refresh);
        AnalysisFacade.getInstance().attach(this);
    }

    public void remove(boolean refresh) {
        GUIFacade.getInstance().mainFrame.removeViewer(viewerPanel, refresh);
        AnalysisFacade.getInstance().detach(this);
    }

    protected JPanel createViewerUI(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {
        return notSupported();
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel, ArrayList<String> supportedViewers){
        viewerPanel.removeAll();

        if(!supportedViewers.contains(this.getClass().getSimpleName()))
            viewerPanel.add(notSupported());
        else
            viewerPanel.add(createViewerUI(analyzedData, title, xAxisLabel, yAxisLabel));
    }

    protected JPanel notSupported() {
        JLabel label = new JLabel("Not Supported");
        label.setForeground(GUIFacade.getInstance().theme.getText2Color());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.setBackground(GUIFacade.getInstance().theme.getBorderColor());
        panel.add(label);

        return panel;
    }
}
