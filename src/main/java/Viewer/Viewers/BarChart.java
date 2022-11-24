package Viewer.Viewers;

import GUI.GUI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BarChart extends Viewer {

    public BarChart () {
        super();
        viewerPanel.add(createViewerUI(new JsonObject[0][0], "", "", ""));
    }

    protected JPanel createViewerUI(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (JsonObject[] jsonObjects: analyzedData) {
            for (JsonObject jsonObject: jsonObjects) {
                dataset.setValue(jsonObject.get("value").getAsDouble(), ((JsonObject) jsonObject.get("indicator")).get("value").getAsString(), jsonObject.get("date").getAsString());
            }
        }

        CategoryPlot plot = new CategoryPlot();
        BarRenderer barrenderer1 = new BarRenderer();

        plot.setDataset(0, dataset);
        plot.setRenderer(0, barrenderer1);
        CategoryAxis domainAxis = new CategoryAxis(xAxisLabel);
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(new NumberAxis(yAxisLabel));

        String fontName = javax.swing.UIManager.getDefaults().getFont("Label.font").getFontName();
        JFreeChart barChart = new JFreeChart(title, new Font(fontName, java.awt.Font.BOLD, 18), plot, true);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(GUI.getInstance().theme.getBorderColor());

        return chartPanel;
    }
}
