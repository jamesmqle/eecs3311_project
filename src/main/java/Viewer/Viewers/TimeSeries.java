package Viewer.Viewers;

import GUI.GUI;
import com.google.gson.JsonObject;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;

import javax.swing.*;
import java.awt.*;

public class TimeSeries extends Viewer {

    public TimeSeries () {
        viewerPanel = createTimeSeries();
        GUI.getInstance().mainFrame.addViewer(viewerPanel);
    }

    private JPanel createTimeSeries() {
        org.jfree.data.time.TimeSeries series1 = new org.jfree.data.time.TimeSeries("Mortality/1000 births");
        series1.add(new Year(2018), 5.6);
        series1.add(new Year(2017), 5.7);
        series1.add(new Year(2016), 5.8);
        series1.add(new Year(2015), 5.8);
        series1.add(new Year(2014), 5.9);
        series1.add(new Year(2013), 6.0);
        series1.add(new Year(2012), 6.1);
        series1.add(new Year(2011), 6.2);
        series1.add(new Year(2010), 6.4);

        org.jfree.data.time.TimeSeries series2 = new org.jfree.data.time.TimeSeries("Health Expenditure per Capita");
        series2.add(new Year(2018), 10624);
        series2.add(new Year(2017), 10209);
        series2.add(new Year(2016), 9877);
        series2.add(new Year(2015), 9491);
        series2.add(new Year(2014), 9023);
        series2.add(new Year(2013), 8599);
        series2.add(new Year(2012), 8399);
        series2.add(new Year(2011), 8130);
        series2.add(new Year(2010), 7930);
        TimeSeriesCollection dataset2 = new TimeSeriesCollection();
        dataset2.addSeries(series2);

        org.jfree.data.time.TimeSeries series3 = new org.jfree.data.time.TimeSeries("Hospital Beds/1000 people");
        series3.add(new Year(2018), 2.92);
        series3.add(new Year(2017), 2.87);
        series3.add(new Year(2016), 2.77);
        series3.add(new Year(2015), 2.8);
        series3.add(new Year(2014), 2.83);
        series3.add(new Year(2013), 2.89);
        series3.add(new Year(2012), 2.93);
        series3.add(new Year(2011), 2.97);
        series3.add(new Year(2010), 3.05);

        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series3);

        XYPlot plot = new XYPlot();
        XYSplineRenderer splinerenderer1 = new XYSplineRenderer();
        XYSplineRenderer splinerenderer2 = new XYSplineRenderer();

        plot.setDataset(0, dataset);
        plot.setRenderer(0, splinerenderer1);
        DateAxis domainAxis = new DateAxis("Year");
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(new NumberAxis(""));

        plot.setDataset(1, dataset2);
        plot.setRenderer(1, splinerenderer2);
        plot.setRangeAxis(1, new NumberAxis("US$"));

        plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
        plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

        JFreeChart chart = new JFreeChart("Mortality vs Expenses & Hospital Beds",
                new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(GUI.getInstance().theme.getBorderColor());

        return chartPanel;
    }

    public void update(JsonObject[][] analyzedData){}
}
