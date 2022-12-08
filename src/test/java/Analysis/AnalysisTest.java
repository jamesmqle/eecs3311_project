package Analysis;

import Analysis.AnalysisFacade;
import Analysis.AnalysisStrategy;
import DataFetcher.DataFetcherFacade;
import GUI.GUIFacade;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.gson.JsonObject;
import org.junit.jupiter.api.*;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnalysisTest {

    @BeforeAll
    public static void setUp() {
        DataFetcherFacade.getInstance().setBaseURL("http://api.worldbank.org/v2");
        GUIFacade.getInstance().mainUI();

        //DecimalFormat df = new DecimalFormat("#.##");
    }

    @Test
    public void TestCO2vsEnergyUsevsAirPollution() {

        AnalysisFacade.getInstance().setAnalysis("CO2vsEnergyUsevsAirPollution");

        DataFetcherFacade.getInstance().dateRange.setRange("2010", "2020");
        DataFetcherFacade.getInstance().country.setCountry("can");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(-1.6346039966555865, testData[0][1].get("value").getAsDouble());
        assertEquals(0, testData[1][8].get("value").getAsDouble());
        assertEquals(-5.995163773311168, testData[2][1].get("value").getAsDouble());

        assertEquals("CO2 vs Energy Use vs Air Pollution",testAnalysis.getTitle());
        assertEquals("Year",testAnalysis.getXAxisLabel());
        assertEquals("Percentage Change (%)",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestAirPollutionvsForestArea() {

        AnalysisFacade.getInstance().setAnalysis("AirPollutionvsForestArea");

        DataFetcherFacade.getInstance().dateRange.setRange("2004", "2019");
        DataFetcherFacade.getInstance().country.setCountry("bg");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(1.0263390708717293, testData[1][2].get("value").getAsDouble());
        assertEquals(-2.196664996262794, testData[0][5].get("value").getAsDouble());

        assertEquals("Air Pollution vs Forest Area",testAnalysis.getTitle());
        assertEquals("Year",testAnalysis.getXAxisLabel());
        assertEquals("Percentage Change (%)",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestCO2vsGDP() {

        AnalysisFacade.getInstance().setAnalysis("CO2vsGDP");

        DataFetcherFacade.getInstance().dateRange.setRange("2000", "2009");
        DataFetcherFacade.getInstance().country.setCountry("br");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(6.233090576508101E-4, testData[0][2].get("value").getAsDouble());
        assertEquals(3.7200248862804804E-4, testData[0][5].get("value").getAsDouble());

        assertEquals("CO2 vs GDP",testAnalysis.getTitle());
        assertEquals("Year",testAnalysis.getXAxisLabel());
        assertEquals("Ratio (CO2/GDP)",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestForestArea() {

        AnalysisFacade.getInstance().setAnalysis("ForestArea");

        DataFetcherFacade.getInstance().dateRange.setRange("2001", "2008");
        DataFetcherFacade.getInstance().country.setCountry("ch");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(69.29275200347723, testData[0][1].get("value").getAsDouble());
        assertEquals(30.707247996522767, testData[0][0].get("value").getAsDouble());

        assertEquals("Average Forest Area",testAnalysis.getTitle());
        assertEquals("",testAnalysis.getXAxisLabel());
        assertEquals("Land Area (%)",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestGovernmentExpenditureOnEducation() {

        AnalysisFacade.getInstance().setAnalysis("GovernmentExpenditureOnEducation");

        DataFetcherFacade.getInstance().dateRange.setRange("2010", "2014");
        DataFetcherFacade.getInstance().country.setCountry("egy");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(3.725833988189698, testData[0][0].get("value").getAsDouble());
        assertEquals(96.27416601181031, testData[0][1].get("value").getAsDouble());

        assertEquals("Average Forest Area",testAnalysis.getTitle());
        assertEquals("",testAnalysis.getXAxisLabel());
        assertEquals("Spending (%)",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestCurrentHealthExpenditurevsHospitalBeds() {

        AnalysisFacade.getInstance().setAnalysis("CurrentHealthExpenditurevsHospitalBeds");

        DataFetcherFacade.getInstance().dateRange.setRange("2013", "2019");
        DataFetcherFacade.getInstance().country.setCountry("usa");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(6.080983433212996, testData[0][3].get("value").getAsDouble());
        assertEquals(0.0, testData[0][5].get("value").getAsDouble());

        assertEquals("Current Health Expenditure vs Hospital Beds",testAnalysis.getTitle());
        assertEquals("Year",testAnalysis.getXAxisLabel());
        assertEquals("Ratio (Current Health Expenditure / Hospital Beds)",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestHealthcareAccessvsMortalityRate() {

        AnalysisFacade.getInstance().setAnalysis("HealthcareAccessvsMortalityRate");

        DataFetcherFacade.getInstance().dateRange.setRange("2015", "2018");
        DataFetcherFacade.getInstance().country.setCountry("fra");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(0.0, testData[0][3].get("value").getAsDouble());
        assertEquals(3.3, testData[1][2].get("value").getAsDouble());

        assertEquals("Women's Access to Healthcare vs Infant Mortality Rate",testAnalysis.getTitle());
        assertEquals("Year",testAnalysis.getXAxisLabel());
        assertEquals("Raw Data",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestGovernmentExpenditureOnEducationvsCurrentHealthExpenditure() {

        AnalysisFacade.getInstance().setAnalysis("GovernmentExpenditureOnEducationvsCurrentHealthExpenditure");

        DataFetcherFacade.getInstance().dateRange.setRange("2012", "2014");
        DataFetcherFacade.getInstance().country.setCountry("can");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(0.0, testData[0][1].get("value").getAsDouble());
        assertEquals(-1.5051266417436338, testData[1][1].get("value").getAsDouble());

        assertEquals("Government Expenditure on Education vs Current Health Expenditure",testAnalysis.getTitle());
        assertEquals("Year",testAnalysis.getXAxisLabel());
        assertEquals("Percentage Change (%)",testAnalysis.getYAxisLabel());

    }

    @Test
    public void TestCO2vsGDPChina() {

        AnalysisFacade.getInstance().setAnalysis("CO2vsGDP");

        DataFetcherFacade.getInstance().dateRange.setRange("2000", "2009");
        DataFetcherFacade.getInstance().country.setCountry("chi");

        AnalysisFacade.getInstance().runAnalysis();

        AnalysisStrategy testAnalysis = AnalysisFacade.getInstance().getAnalysis();

        JsonObject[][] testData = testAnalysis.runAnalysis();

        assertEquals(0.0, testData[0][2].get("value").getAsDouble());
        assertEquals(0.0, testData[0][5].get("value").getAsDouble());

        assertEquals("CO2 vs GDP",testAnalysis.getTitle());
        assertEquals("Year",testAnalysis.getXAxisLabel());
        assertEquals("Ratio (CO2/GDP)",testAnalysis.getYAxisLabel());

    }

}
