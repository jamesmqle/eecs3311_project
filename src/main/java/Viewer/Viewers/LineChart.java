package Viewer.Viewers;

import GUI.GUI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class LineChart extends Viewer {

    public LineChart () {
        super();
        viewerPanel.add(createLine(new JsonObject[0][0], "", "", ""));
        GUI.getInstance().mainFrame.addViewer(viewerPanel);
    }

    private JPanel createLine(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {
        XYSeriesCollection dataset = new XYSeriesCollection();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (JsonObject[] jsonObjects: analyzedData) {
            XYSeries series = null;

            for (JsonObject jsonObject: jsonObjects) {
                System.out.println(gson.toJson(jsonObject));

                if(series == null)
                    series = new XYSeries(((JsonObject) jsonObject.get("indicator")).get("value").getAsString());

                series.add(jsonObject.get("date").getAsInt(), jsonObject.get("value").getAsDouble());
            }

            dataset.addSeries(series);
        }

//        XYSeries series1 = new XYSeries("Mortality/1000 births");
//        series1.add(2018, 5.6);
//        series1.add(2017, 5.7);
//        series1.add(2016, 5.8);
//        series1.add(2015, 5.8);
//        series1.add(2014, 5.9);
//        series1.add(2013, 6.0);
//        series1.add(2012, 6.1);
//        series1.add(2011, 6.2);
//        series1.add(2010, 6.4);
//
//        XYSeries series2 = new XYSeries("Health Expenditure per Capita");
//        series2.add(2018, 10624);
//        series2.add(2017, 10209);
//        series2.add(2016, 9877);
//        series2.add(2015, 9491);
//        series2.add(2014, 9023);
//        series2.add(2013, 8599);
//        series2.add(2012, 8399);
//        series2.add(2011, 8130);
//        series2.add(2010, 7930);
//
//        XYSeries series3 = new XYSeries("Hospital Beds/1000 people");
//        series3.add(2018, 2.92);
//        series3.add(2017, 2.87);
//        series3.add(2016, 2.77);
//        series3.add(2015, 2.8);
//        series3.add(2014, 2.83);
//        series3.add(2013, 2.89);
//        series3.add(2012, 2.93);
//        series3.add(2011, 2.97);
//        series3.add(2010, 3.05);


//        dataset.addSeries(series1);
//        dataset.addSeries(series2);
//        dataset.addSeries(series3);

        JFreeChart chart = ChartFactory.createXYLineChart(title, xAxisLabel, yAxisLabel, dataset, PlotOrientation.VERTICAL, true, true, false);

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle(title, new Font("Arial", java.awt.Font.BOLD, 18)));

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(GUI.getInstance().theme.getBorderColor());

        return chartPanel;
    }

    public void update(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel){

        viewerPanel.removeAll();
        viewerPanel.add(createLine(analyzedData, title, xAxisLabel, yAxisLabel));
        GUI.getInstance().refreshMainUI();
    }
}
