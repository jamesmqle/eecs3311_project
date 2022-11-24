package Analysis;

import GUI.GUI;
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

    public void setAnalysis(String type){
        type = type.replaceAll(" ", "");

        switch(type) {
            case "CO2vsEnergyUsevsAirPollution":
                analysisStrategy = new CO2vsEnergyUsevsAirPollution();
                break;
            case "AirPollutionvsForestArea":
                analysisStrategy = new AirPollutionvsForestArea();
                break;
            case "CO2vsGDP":
                analysisStrategy = new CO2vsGDP();
                break;
            case "ForestArea":
                analysisStrategy = new ForestArea();
                break;
            case "GovernmentExpenditureOnEducation":
                analysisStrategy = new GovernmentExpenditureOnEducation();
                break;
            case "CurrentHealthExpenditurevsHospitalBeds":
                analysisStrategy = new CurrentHealthExpenditureVSHospitalBeds();
                break;
            case "HealthcareAccessvsMortalityRate":
                analysisStrategy = new HealthcareAccessvsMortalityRate();
                break;
            case "GovernmentExpenditureOnEducationvsCurrentHealthExpenditure":
                analysisStrategy = new GovernmentExpenditureOnEducationVSCurrentHealthExpenditure();
                break;
            default:
                // code block
        }
    }

    public void runAnalysis(){
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
            viewerObserver.update(analyzedData, analysisStrategy.getTitle(), analysisStrategy.getXAxisLabel(), analysisStrategy.getYAxisLabel(), analysisStrategy.getSupportedViewers());
        }
        GUI.getInstance().refreshMainUI();
    }
}