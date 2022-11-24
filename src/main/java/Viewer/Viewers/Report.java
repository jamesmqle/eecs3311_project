package Viewer.Viewers;

import GUI.GUI;
import com.google.gson.JsonObject;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.Year;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Report extends Viewer {

    public Report () {
        super();
        viewerPanel.add(createViewerUI(new JsonObject[0][0], "", "", ""));
    }

    protected JPanel createViewerUI(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {
        JTextArea report = new JTextArea();
        report.setEditable(false);
        report.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        report.setBackground(Color.white);
        String reportMessage = title + "\n==============================\n";

        if(analyzedData.length > 0) {

            for (int i = 0; i < analyzedData[0].length; i++) {
                String date = "";
                String info = "";

                for (int j = 0; j < analyzedData.length; j++) {

                    JsonObject jsonObject = analyzedData[j][i];

                    info += ((JsonObject) jsonObject.get("indicator")).get("value").getAsString() + " = " + jsonObject.get("value").getAsDouble() + "\n";

                    date = jsonObject.get("date").getAsString();
                }

                reportMessage += xAxisLabel + " " + date + ":\n" + info + "\n";
            }
        }

        report.setText(reportMessage);
        JScrollPane outputScrollPane = new JScrollPane(report);
        outputScrollPane.setPreferredSize(new Dimension(400, 320));
        JPanel outputPanel = new JPanel();
        outputPanel.setBackground(GUI.getInstance().theme.getBorderColor());
        outputPanel.add(outputScrollPane);

        return outputPanel;
    }
}
