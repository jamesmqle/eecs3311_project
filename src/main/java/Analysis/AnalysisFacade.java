package Analysis;

public class AnalysisFacade {

    private AnalysisStrategy analysisStrategy;
    //Singleton
    private static final AnalysisFacade analysis = new AnalysisFacade();
    private AnalysisFacade() {

    }
    public static AnalysisFacade getInstance() {
        return analysis;
    }

    public void setAnalysis(String code){
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
        analysisStrategy.runAnalysis();
    }


}