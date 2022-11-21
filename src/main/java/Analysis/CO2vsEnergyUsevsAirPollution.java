package Analysis;

import DataFetcher.DataFetcherFacade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

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
}
