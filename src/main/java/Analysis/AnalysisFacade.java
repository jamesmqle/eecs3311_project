package Analysis;

import Viewer.Viewers.Viewer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class AnalysisFacade {

    //Singleton
    private static final AnalysisFacade analysis = new AnalysisFacade();
    private AnalysisFacade() {

    }
    public static AnalysisFacade getInstance() {
        return analysis;
    }

    private AnalysisStrategy analysisStrategy;

    private List<Viewer> viewerObservers = new ArrayList<>();

    public void setAnalysis(String code){
        code = code.replaceAll(" ", "");

        switch(code) {
            case "CO2vsEnergyUsevsAirPollution":
                analysisStrategy = new CO2vsEnergyUsevsAirPollution();
                break;
            default:
                // code block
        }
    }

    public void runAnalysis(){
        System.out.println("facade");
        JsonObject[][] analyzedData = analysisStrategy.runAnalysis();

        updateViewerObservers(analyzedData);
    }

    public void attach(Viewer viewerObserver) {
        viewerObservers.add(viewerObserver);
    }

    public void detach(Viewer viewerObserver) {
        viewerObservers.remove(viewerObserver);
    }

    private void updateViewerObservers(JsonObject[][] analyzedData) {
        for (Viewer viewerObserver: viewerObservers) {
            viewerObserver.update(analyzedData, analysisStrategy.getTitle(), analysisStrategy.getXAxisLabel(), analysisStrategy.getYAxisLabel());
        }
    }
}