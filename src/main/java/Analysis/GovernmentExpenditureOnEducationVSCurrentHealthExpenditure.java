package Analysis;

import GUI.GUI;
import DataFetcher.DataFetcherFacade;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Arrays;
import java.util.Collections;

public class GovernmentExpenditureOnEducationVSCurrentHealthExpenditure extends AnalysisStrategy {

    public GovernmentExpenditureOnEducationVSCurrentHealthExpenditure(){

        int fromYear = Integer.parseInt(GUI.getInstance().mainFrame.getFromYear()) - 1;

        DataFetcherFacade.getInstance().dateRange.setRange(Integer.toString(fromYear), GUI.getInstance().mainFrame.getToYear());
        DataFetcherFacade.getInstance().country.setCountry(GUI.getInstance().mainFrame.getCountry());

        dataKeys.add("SE.XPD.TOTL.GD.ZS"); // Government Expenditure on Education
        dataKeys.add("SH.XPD.CHEX.GD.ZS"); // Current Health Expenditure

        title = "Government Expenditure on Education vs Current Health Expenditure";
        xAxisLabel = "Year";
        yAxisLabel = "Percentage Change (%)";

        supportedViewers.add("BarChart");
        supportedViewers.add("LineChart");
        supportedViewers.add("ScatterChart");
        supportedViewers.add("TimeSeriesChart");
        supportedViewers.add("Report");
    }

    @Override
    public JsonObject[][] runAnalysis() {
        System.out.println("GovernmentExpenditureOnEducationVSCurrentHealthExpenditure");

        JsonObject[] geoeData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(0));
        Collections.reverse(Arrays.asList(geoeData));
        JsonObject[] cheData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(1));
        Collections.reverse(Arrays.asList(cheData));

        JsonObject[][] analyzedData = new JsonObject[2][];

        analyzedData[0] = annualPercentageChange(geoeData);
        analyzedData[1] = annualPercentageChange(cheData);

        return analyzedData;
    }

    private JsonObject[] annualPercentageChange (JsonObject[] data) {
        double past = -1;
        for (JsonObject jsonObject: data) {

            // Calculate annual percentage change > Replace the value
            JsonElement nowElement = jsonObject.get("value");
            if(!nowElement.isJsonNull()) {
                double now = nowElement.getAsDouble();

                if(past != -1) {
                    double newValue = ((now - past) / past) * 100;      // Formula - annual percentage change
                    jsonObject.addProperty("value", newValue);
                }

                past = now;
            } else {
                jsonObject.addProperty("value", 0);
            }

        }
        //Remove the oldest year
        data = Arrays.copyOfRange(data, 1, data.length);

        return data;
    }
}
