package Analysis;

import GUI.GUI;
import DataFetcher.DataFetcherFacade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.jfree.data.json.impl.JSONValue;

import java.util.Arrays;
import java.util.Collections;

public class CO2vsGDP extends AnalysisStrategy {
    public CO2vsGDP() {

        int fromYear = Integer.parseInt(GUI.getInstance().mainFrame.getFromYear());

        DataFetcherFacade.getInstance().dateRange.setRange(Integer.toString(fromYear), GUI.getInstance().mainFrame.getToYear());
        DataFetcherFacade.getInstance().country.setCountry(GUI.getInstance().mainFrame.getCountry());

        dataKeys.add("EN.ATM.CO2E.PC"); // CO2
        dataKeys.add("NY.GDP.PCAP.CD"); // GDP

        title = "CO2 vs GDP";
        xAxisLabel = "Year";
        yAxisLabel = "Ratio (CO2/GDP)";

        supportedViewers.add("BarChart");
        supportedViewers.add("LineChart");
        supportedViewers.add("ScatterChart");
        supportedViewers.add("TimeSeriesChart");
        supportedViewers.add("Report");
    }

    @Override
    public JsonObject[][] runAnalysis() {
        System.out.println("CO2vsGDP");

        JsonObject[] CO2Data = DataFetcherFacade.getInstance().fetchData(dataKeys.get(0));
        Collections.reverse(Arrays.asList(CO2Data));
        JsonObject[] GDPData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(1));
        Collections.reverse(Arrays.asList(GDPData));

        JsonObject[][] analyzedData = new JsonObject[1][];

        analyzedData[0] = annualRatio(CO2Data,GDPData);

        return analyzedData;
    }

    private JsonObject[] annualRatio(JsonObject[] dataOne, JsonObject[] dataTwo) {
        for (int i = 0; i < dataOne.length; i++) {

            JsonElement nowElementOne = dataOne[i].get("value");
            JsonElement nowElementTwo = dataTwo[i].get("value");

            if ( !nowElementOne.isJsonNull() && !nowElementTwo.isJsonNull() ) {
                double nowOne = nowElementOne.getAsDouble();
                double nowTwo = nowElementTwo.getAsDouble();

                double newValue = ( nowOne / nowTwo ); // Formula - annual ratio
                dataOne[i].addProperty("value", newValue);

            } else {
                dataOne[i].addProperty("value", 0);
            }

        }

        return dataOne;
    }

}