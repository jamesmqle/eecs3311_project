package Analysis;

class AnalysisFacade {

    //Singleton
    private static final AnalysisFacade analysis = new AnalysisFacade();
    private AnalysisFacade() {}
    public static AnalysisFacade getInstance() {
        return analysis;
    }

}