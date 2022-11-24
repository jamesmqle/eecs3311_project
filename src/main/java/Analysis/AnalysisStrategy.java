package Analysis;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public abstract class AnalysisStrategy {

    protected String title;
    protected String xAxisLabel;
    protected String yAxisLabel;

    protected ArrayList<String> supportedViewers = new ArrayList<>();

    public AnalysisStrategy(){}

    public abstract JsonObject[][] runAnalysis();

    protected List<String> dataKeys = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public String getXAxisLabel() {
        return xAxisLabel;
    }

    public String getYAxisLabel() {
        return yAxisLabel;
    }

    public ArrayList<String> getSupportedViewers () {
        ArrayList<String> supportedViewersCopy = new ArrayList<>();
        supportedViewersCopy.addAll(supportedViewers);
        return supportedViewersCopy;
    }
}
