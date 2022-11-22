package Viewer.Viewers;

import GUI.GUI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class PieChart extends Viewer {

    public PieChart () {
        super();
        viewerPanel.add(createPie(new JsonObject[0][0], "", "", ""));
    }

    private JPanel createPie(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (JsonObject[] jsonObjects: analyzedData) {
            for (JsonObject jsonObject: jsonObjects) {
                dataset.addValue(jsonObject.get("value").getAsDouble(), ((JsonObject) jsonObject.get("indicator")).get("value").getAsString(), "");
            }
        }

        String fontName = javax.swing.UIManager.getDefaults().getFont("Label.font").getFontName();
        JFreeChart pieChart = ChartFactory.createMultiplePieChart(title, dataset, TableOrder.BY_COLUMN, true, true, true);

        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(GUI.getInstance().theme.getBorderColor());

        return chartPanel;
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (JsonObject[] jsonObjects: analyzedData) {
            for (JsonObject jsonObject: jsonObjects) {
                System.out.println(gson.toJson(jsonObject));
            }
        }

        viewerPanel.removeAll();
        viewerPanel.add(createPie(analyzedData, title, xAxisLabel, yAxisLabel));
    }
}
