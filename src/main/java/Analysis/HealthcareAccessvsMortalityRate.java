package Analysis;

import DataFetcher.DataFetcherFacade;
import GUI.GUIFacade;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Arrays;
import java.util.Collections;

public class HealthcareAccessvsMortalityRate extends AnalysisStrategy {
    public HealthcareAccessvsMortalityRate() {

        int fromYear = Integer.parseInt(GUIFacade.getInstance().mainFrame.getFromYear());

        DataFetcherFacade.getInstance().dateRange.setRange(Integer.toString(fromYear), GUIFacade.getInstance().mainFrame.getToYear());
        DataFetcherFacade.getInstance().country.setCountry(GUIFacade.getInstance().mainFrame.getCountry());

        dataKeys.add("SH.ACS.MONY.Q1.ZS"); // Women's Health Care Access
        dataKeys.add("SP.DYN.IMRT.IN"); // Infant Mortality Rate

        title = "Women's Access to Healthcare vs Infant Mortality Rate";
        xAxisLabel = "Year";
        yAxisLabel = "Raw Data";

        supportedViewers.add("BarChart");
        supportedViewers.add("LineChart");
        supportedViewers.add("ScatterChart");
        supportedViewers.add("TimeSeriesChart");
        supportedViewers.add("Report");
    }

    @Override
    public JsonObject[][] runAnalysis() {
        System.out.println("HealthcareAccessvsMortalityRate");

        JsonObject[] healthcareAccessData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(0));
        Collections.reverse(Arrays.asList(healthcareAccessData));
        JsonObject[] mortalityRate = DataFetcherFacade.getInstance().fetchData(dataKeys.get(1));
        Collections.reverse(Arrays.asList(mortalityRate));

        JsonObject[][] analyzedData = new JsonObject[2][];

        analyzedData[0] = rawData(healthcareAccessData);
        analyzedData[1] = rawData(mortalityRate);

        return analyzedData;
    }

    private JsonObject[] rawData (JsonObject[] data) {
        for (JsonObject jsonObject: data) {
            // Calculate annual percentage change > Replace the value
            JsonElement nowElement = jsonObject.get("value");
            if(nowElement.isJsonNull()) {
                jsonObject.addProperty("value", 0);
            }

        }
        return data;
    }
}