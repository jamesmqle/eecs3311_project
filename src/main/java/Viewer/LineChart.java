package Viewer;

import GUI.GUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class LineChart extends Viewer {

    public LineChart () {
        viewerPanel = createLine();
        GUI.getInstance().mainFrame.addViewer(viewerPanel);
    }

    private JPanel createLine() {
        XYSeries series1 = new XYSeries("Mortality/1000 births");
        series1.add(2018, 5.6);
        series1.add(2017, 5.7);
        series1.add(2016, 5.8);
        series1.add(2015, 5.8);
        series1.add(2014, 5.9);
        series1.add(2013, 6.0);
        series1.add(2012, 6.1);
        series1.add(2011, 6.2);
        series1.add(2010, 6.4);

        XYSeries series2 = new XYSeries("Health Expenditure per Capita");
        series2.add(2018, 10624);
        series2.add(2017, 10209);
        series2.add(2016, 9877);
        series2.add(2015, 9491);
        series2.add(2014, 9023);
        series2.add(2013, 8599);
        series2.add(2012, 8399);
        series2.add(2011, 8130);
        series2.add(2010, 7930);

        XYSeries series3 = new XYSeries("Hospital Beds/1000 people");
        series3.add(2018, 2.92);
        series3.add(2017, 2.87);
        series3.add(2016, 2.77);
        series3.add(2015, 2.8);
        series3.add(2014, 2.83);
        series3.add(2013, 2.89);
        series3.add(2012, 2.93);
        series3.add(2011, 2.97);
        series3.add(2010, 3.05);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);

        JFreeChart chart = ChartFactory.createXYLineChart("Mortality vs Expenses & Hospital Beds", "Year", "", dataset,
                PlotOrientation.VERTICAL, true, true, false);

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

        chart.setTitle(
                new TextTitle("Mortality vs Expenses & Hospital Beds", new Font("Serif", java.awt.Font.BOLD, 18)));

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);

        return chartPanel;
    }
}
