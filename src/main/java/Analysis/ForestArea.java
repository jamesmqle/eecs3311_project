package Analysis;

import DataFetcher.DataFetcherFacade;
import GUI.GUIFacade;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ForestArea extends AnalysisStrategy {

    public ForestArea(){

        DataFetcherFacade.getInstance().dateRange.setRange(GUIFacade.getInstance().mainFrame.getFromYear(), GUIFacade.getInstance().mainFrame.getToYear());
        DataFetcherFacade.getInstance().country.setCountry(GUIFacade.getInstance().mainFrame.getCountry());

        dataKeys.add("AG.LND.FRST.ZS"); // Forest Area

        title = "Average Forest Area";
        xAxisLabel = "";
        yAxisLabel = "Land Area (%)";

        supportedViewers.add("BarChart");
        supportedViewers.add("PieChart");
    }

    @Override
    public JsonObject[][] runAnalysis() {
        System.out.println("ForestArea");

        JsonObject[] forestAreaData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(0));

        JsonObject[][] analyzedData = new JsonObject[1][];

        analyzedData[0] = averageLandArea(forestAreaData);

        return analyzedData;
    }

    private JsonObject[] averageLandArea (JsonObject[] data) {

        double total = 0;
        int amount = 0;
        for (JsonObject jsonObject: data) {
            JsonElement element = jsonObject.get("value");
            if(!element.isJsonNull()) {
                total += element.getAsDouble();
                amount++;
            }
        }

        double average = total / amount;

        JsonObject[] returnData = new JsonObject[2];
        returnData[0] = data[0].deepCopy();
        returnData[1] = data[0].deepCopy();

        returnData[0].addProperty("value", average);
        returnData[0].addProperty("date", "");

        returnData[1].addProperty("value", 100 - average);
        returnData[1].addProperty("date", "");
        ((JsonObject) returnData[1].get("indicator")).addProperty("value", "Other (% of land area)");

        return returnData;
    }

}
