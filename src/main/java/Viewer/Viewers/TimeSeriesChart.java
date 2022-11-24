package Viewer.Viewers;

import GUI.GUIFacade;
import com.google.gson.JsonObject;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;

import javax.swing.*;
import java.awt.*;

public class TimeSeriesChart extends Viewer {

    public TimeSeriesChart() {
        super();
        viewerPanel.add(createViewerUI(new JsonObject[0][0], "", "", ""));
    }

    protected JPanel createViewerUI(JsonObject[][] analyzedData, String title, String xAxisLabel, String yAxisLabel) {
        TimeSeriesCollection dataset = new TimeSeriesCollection();

        for (JsonObject[] jsonObjects : analyzedData) {
            TimeSeries series = null;

            for (JsonObject jsonObject : jsonObjects) {
                if (series == null)
                    series = new TimeSeries(((JsonObject) jsonObject.get("indicator")).get("value").getAsString());

                series.add(new Year(jsonObject.get("date").getAsInt()), jsonObject.get("value").getAsDouble());
            }

            dataset.addSeries(series);
        }

        XYPlot plot = new XYPlot();
        XYSplineRenderer splinerenderer1 = new XYSplineRenderer();

        plot.setDataset(0, dataset);
        plot.setRenderer(0, splinerenderer1);
        DateAxis domainAxis = new DateAxis(xAxisLabel);
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(new NumberAxis(yAxisLabel));

        plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
        plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

        String fontName = javax.swing.UIManager.getDefaults().getFont("Label.font").getFontName();
        JFreeChart chart = new JFreeChart(title, new Font(fontName, java.awt.Font.BOLD, 18), plot, true);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(400, 300));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(GUIFacade.getInstance().theme.getBorderColor());

        return chartPanel;
    }
}
