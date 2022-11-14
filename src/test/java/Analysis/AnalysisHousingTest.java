package Analysis;

public class AnalysisHousingTest {
    private AnalysisStrategy analysis;
    private int data = 734;

    public AnalysisHousingTest(AnalysisStrategy analysis){
        this.analysis = analysis;
    }

    public void setStrategy(AnalysisStrategy analysis){
        this.analysis = analysis;
    }

    public int analyze(int input){
        return analysis.runAnalysis(input);
    }

    public int getData(){
        return data;
    }
}
