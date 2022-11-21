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

public class BarChart extends Viewer {

    public BarChart () {
        viewerPanel = createBar();
        GUI.getInstance().mainFrame.addViewer(viewerPanel);
    }

    public JPanel createBar() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(5.6, "Mortality/1000 births", "2018");
        dataset.setValue(5.7, "Mortality/1000 births", "2017");
        dataset.setValue(5.8, "Mortality/1000 births", "2016");
        dataset.setValue(5.8, "Mortality/1000 births", "2015");
        dataset.setValue(5.9, "Mortality/1000 births", "2014");
        dataset.setValue(6, "Mortality/1000 births", "2013");
        dataset.setValue(6.1, "Mortality/1000 births", "2012");
        dataset.setValue(6.2, "Mortality/1000 births", "2011");
        dataset.setValue(6.4, "Mortality/1000 births", "2010");

        dataset.setValue(2.92, "Hospital beds/1000 people", "2018");
        dataset.setValue(2.87, "Hospital beds/1000 people", "2017");
        dataset.setValue(2.77, "Hospital beds/1000 people", "2016");
        dataset.setValue(2.8, "Hospital beds/1000 people", "2015");
        dataset.setValue(2.83, "Hospital beds/1000 people", "2014");
        dataset.setValue(2.89, "Hospital beds/1000 people", "2013");
        dataset.setValue(2.93, "Hospital beds/1000 people", "2012");
        dataset.setValue(2.97, "Hospital beds/1000 people", "2011");
        dataset.setValue(3.05, "Hospital beds/1000 people", "2010");

        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();

        dataset2.setValue(10623, "Health Expenditure per Capita", "2018");
        dataset2.setValue(10209, "Health Expenditure per Capita", "2017");
        dataset2.setValue(9877, "Health Expenditure per Capita", "2016");
        dataset2.setValue(9491, "Health Expenditure per Capita", "2015");
        dataset2.setValue(9023, "Health Expenditure per Capita", "2014");
        dataset2.setValue(8599, "Health Expenditure per Capita", "2013");
        dataset2.setValue(8399, "Health Expenditure per Capita", "2012");
        dataset2.setValue(8130, "Health Expenditure per Capita", "2011");
        dataset2.setValue(7930, "Health Expenditure per Capita", "2010");

        CategoryPlot plot = new CategoryPlot();
        BarRenderer barrenderer1 = new BarRenderer();
        BarRenderer barrenderer2 = new BarRenderer();

        plot.setDataset(0, dataset);
        plot.setRenderer(0, barrenderer1);
        CategoryAxis domainAxis = new CategoryAxis("Year");
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(new NumberAxis(""));

        plot.setDataset(1, dataset2);
        plot.setRenderer(1, barrenderer2);
        plot.setRangeAxis(1, new NumberAxis("US$"));

        plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
        plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

        JFreeChart barChart = new JFreeChart("Mortality vs Expenses & Hospital Beds",
                new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

        // Different way to create bar chart
        /*
         * dataset = new DefaultCategoryDataset();
         *
         * dataset.addValue(3.946, "Unemployed", "Men"); dataset.addValue(96.054,
         * "Employed", "Men"); dataset.addValue(3.837, "Unemployed", "Women");
         * dataset.addValue(96.163, "Employed", "Women"); barChart =
         * ChartFactory.createBarChart("Unemployment: Men vs Women", "Gender",
         * "Percentage", dataset, PlotOrientation.VERTICAL, true, true, false);
         */

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(GUI.getInstance().theme.getBorderColor());

        return chartPanel;
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel){
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//        for (JsonObject[] jsonObjects: analyzedData) {
//            for (JsonObject jsonObject: jsonObjects) {
//                System.out.println(gson.toJson(jsonObject));
//            }
//        }

        viewerPanel.removeAll();
        viewerPanel.add(createBar(analyzedData, title, xAxisLabel, yAxisLabel));
        GUI.getInstance().refreshMainUI();
    }
}
