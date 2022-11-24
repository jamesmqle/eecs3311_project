package Analysis;

import DataFetcher.DataFetcherFacade;
import GUI.GUI;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Arrays;
import java.util.Collections;

public class CurrentHealthExpenditureVSHospitalBeds extends AnalysisStrategy {

    public CurrentHealthExpenditureVSHospitalBeds(){

        DataFetcherFacade.getInstance().dateRange.setRange(GUI.getInstance().mainFrame.getFromYear(), GUI.getInstance().mainFrame.getToYear());
        DataFetcherFacade.getInstance().country.setCountry(GUI.getInstance().mainFrame.getCountry());

        dataKeys.add("SH.XPD.CHEX.GD.ZS"); // Current health expenditure
        dataKeys.add("SH.MED.BEDS.ZS"); // Hospital beds

        title = "Current Health Expenditure vs Hospital Beds";
        xAxisLabel = "Year";
        yAxisLabel = "Ratio (Current Health Expenditure / Hospital Beds)";

        supportedViewers.add("BarChart");
        supportedViewers.add("LineChart");
        supportedViewers.add("ScatterChart");
        supportedViewers.add("TimeSeriesChart");
        supportedViewers.add("Report");
    }

    @Override
    public JsonObject[][] runAnalysis() {

        JsonObject[] cheData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(0));
        Collections.reverse(Arrays.asList(cheData));
        JsonObject[] hbData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(1));
        Collections.reverse(Arrays.asList(hbData));

        JsonObject[][] analyzedData = new JsonObject[1][];

        analyzedData[0] = annualRatio(cheData,hbData);

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
