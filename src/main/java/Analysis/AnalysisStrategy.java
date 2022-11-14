package Analysis;

import com.google.gson.JsonObject;

public abstract class AnalysisStrategy {
    protected String dataKey;
    public AnalysisStrategy(){}


    public abstract JsonObject[] runAnalysis();
}
