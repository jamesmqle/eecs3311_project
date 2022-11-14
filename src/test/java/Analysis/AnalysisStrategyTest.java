package Analysis;

import DataFetcher.DataFetcherFacade;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AnalysisStrategyTest {
    @Test
    public void TestSwappingAnalysis() {
        AnalysisHousingTest housing = new AnalysisHousingTest(new Mortality());

        assertEquals(housing.analyze(housing.getData()),housing.getData()*1);

        housing.setStrategy(new MortalityVSExpenses());

        assertEquals(housing.analyze(housing.getData()),housing.getData()*2);
    }
}
