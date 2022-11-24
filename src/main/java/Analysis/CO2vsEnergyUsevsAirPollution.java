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

//Sample Analysis
public class CO2vsEnergyUsevsAirPollution extends AnalysisStrategy {

    public CO2vsEnergyUsevsAirPollution(){

        int fromYear = Integer.parseInt(GUI.getInstance().mainFrame.getFromYear()) - 1;

        DataFetcherFacade.getInstance().dateRange.setRange(Integer.toString(fromYear), GUI.getInstance().mainFrame.getToYear());
        DataFetcherFacade.getInstance().country.setCountry(GUI.getInstance().mainFrame.getCountry());

        dataKeys.add("EN.ATM.CO2E.PC"); // CO2
        dataKeys.add("EG.USE.PCAP.KG.OE"); // Energy Use
        dataKeys.add("EN.ATM.PM25.MC.M3"); // Air Pollution

        title = "CO2 vs Energy Use vs Air Pollution";
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
        System.out.println("CO2vsEnergyUsevsAirPollution");

        JsonObject[] CO2Data = DataFetcherFacade.getInstance().fetchData(dataKeys.get(0));
        Collections.reverse(Arrays.asList(CO2Data));
        JsonObject[] EnergyData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(1));
        Collections.reverse(Arrays.asList(EnergyData));
        JsonObject[] AirPollutionData = DataFetcherFacade.getInstance().fetchData(dataKeys.get(2));
        Collections.reverse(Arrays.asList(AirPollutionData));

        JsonObject[][] analyzedData = new JsonObject[3][];

        analyzedData[0] = annualPercentageChange(CO2Data);
        analyzedData[1] = annualPercentageChange(EnergyData);
        analyzedData[2] = annualPercentageChange(AirPollutionData);

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
