package Viewer;

public class ViewerFactory {


    public Viewer buildViewer(String type) {

        return switch (type) {
            case "BarChart" -> new BarChart();
            case "LineChart" -> new LineChart();
            case "ScatterChart" -> new ScatterChart();
            case "Report" -> new Report();
            case "PieChart" -> new PieChart();
            case "TimeSeries" -> new TimeSeries();
            default -> null;
        };
    }

}
