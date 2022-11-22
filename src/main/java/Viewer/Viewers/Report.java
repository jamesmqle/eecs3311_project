package Viewer.Viewers;

import GUI.GUI;
import com.google.gson.JsonObject;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.Year;

import javax.swing.*;
import java.awt.*;

public class Report extends Viewer {

    public Report () {
        super();
        viewerPanel.add(createReport(new JsonObject[0][0], "", "", ""));
    }

    private JPanel createReport(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {
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

//        reportMessage = "Mortality vs Expenses & Hospital Beds\n" + "==============================\n" + "Year 2018:\n"
//                + "\tMortality/1000 births => 5.6\n" + "\tHealth Expenditure per Capita => 10624\n"
//                + "\tHospital Beds/1000 people => 2.92\n" + "\n" + "Year 2017:\n" + "\tMortality/1000 births => 5.7\n"
//                + "\tHealth Expenditure per Capita => 10209\n" + "\tHospital Beds/1000 people => 2.87\n" + "\n"
//                + "Year 2016:\n" + "\tMortality/1000 births => 5.8\n" + "\tHealth Expenditure per Capita => 9877\n"
//                + "\tHospital Beds/1000 people => 2.77\n";


        report.setText(reportMessage);
        JScrollPane outputScrollPane = new JScrollPane(report);
        outputScrollPane.setPreferredSize(new Dimension(400, 320));
        JPanel outputPanel = new JPanel();
        outputPanel.setBackground(GUI.getInstance().theme.getBorderColor());
        outputPanel.add(outputScrollPane);

        return outputPanel;
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel){
        viewerPanel.removeAll();
        viewerPanel.add(createReport(analyzedData, title, xAxisLabel, yAxisLabel));
    }
}
