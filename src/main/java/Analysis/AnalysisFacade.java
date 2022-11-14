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
            case "SP.POP.TOTL":
                analysisStrategy = new Mortality();
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