package Viewer;

import Viewer.Viewers.*;

public class ViewerFactory {

    public Viewer buildViewer(String type) {

        switch (type) {
            case "BarChart":
            	return new BarChart();
            case "LineChart":
            	return new LineChart();
            case "ScatterChart":
            	return new ScatterChart();
            case "Report":
            	return new Report();
            case "PieChart":
            	return new PieChart();
            case "TimeSeries":
            	return new TimeSeriesChart();
            default:
            	return null;
        }
    }

}
